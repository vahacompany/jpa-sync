package com.vaha.jpaSync.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.domain.ConvTaskDeta;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConvTaskDetaRepositoryTest {

	@Autowired
	ConvTaskDetaRepository convTaskDetaRepository;
	@Autowired
	ConvTaskRepository convTaskRepository;

	ConvTask convTask;

	@BeforeEach
	void setup() {
		// IntStream.range(1,11).forEach(i -> {
		convTask = ConvTask.builder().convInstCd("R001").convTaskNum("TASK001").convTaskNm("협약과제명").bimokGrouCd("BM001")
				.rrReseRegiNum("1234567890").build();

		convTaskRepository.save(convTask);

		ConvTaskDeta convTaskDeta = ConvTaskDeta.builder().convTask(convTask) // 협약기관과제
				.convInstCd("R001") // 협약_기관_코드
				.convTaskNum("TASK001") // 협약_과제_번호
				.bimokGrouBizNm("비목구분사업명칭") // 비목_구분_사업_명
				.bizClasCd("BIZ001") // 사업_분류_코드
				.techFielCd("TEAC01") // 기술_분야_코드
				.totaRechStDd("20190101") // 총_연구_시작_일자
				.totaRechEdDd("20211231") // 총_연구_종료_일자
				.currRechStDd("20200101") // 당해_연구_시작_일자
				.currRechEdDd("20201231") // 당해_연구_종료_일자
				.currRechDevpAmt(100000000) // 당해_연구_개발비
				.currGovAmt(50000000) // 해_정부_출연금
				.currGovNonAmt(20000000) // 당해_정부_외_출연금
				.currCorpCash(10000000) // 당해_기업_부담금_현금
				.currCorpStuf(20000000) // 당해_기업_부담금_현물
				.otheCounCash(0) // 상대_국가_부담금
				.carrCash(1000000) // 이월_현금
				.carrStuf(1200000) // 이월_현물
				.inteCash(100000) // 이자_현금
				.inteStuf(120000) // 이자_현물
				.reseRequBkCd("082") // 연구비_청구_은행_코드
				.reseRequAccNum("7162683787622") // 연구비_청구_계좌_번호
				.reseRequAccHold("홍길동") // 연구비_청구_계좌_예금주
				.reseCardBkCd("082") // 연구비_카드_은행_코드
				.reseCardPaymAccNum("738927923494") // 연구비_카드_결제_계좌_번호
				.reseCardPaymAccHold("박길동") // 연구비_카드_결제_계좌_예금주
				.rechInstBizRegiNum("1028377480") // 연구_수행기관_사업자_등록번호
				.rechInstGrouCd("10") // 연구_수행기관_구분_코드
				.rechInstCorpEngNm("수행기관영문") // 연구_수행기관_법인_영문_명
				.build();

		convTaskDetaRepository.save(convTaskDeta);
		// });
	}

	@AfterEach
	void tearDown() {
		List<ConvTaskDeta> result = convTaskDetaRepository.findAll();
		System.out.print("result = " + result.size());
		for (ConvTaskDeta convTaskDeta : result) {
			convTaskDetaRepository.delete(convTaskDeta);
			System.out.print("convTaskDeta.getId() = " + convTaskDeta.getId());
		}

		List<ConvTask> result1 = convTaskRepository.findAll();
		System.out.print("result = " + result1.size());
		for (ConvTask convTask : result1) {
			convTaskRepository.delete(convTask);
			System.out.print("convTask.getId() = " + convTask.getId());
		}
	}

	@Test
//    @Transactional //트랜젝션
//    @Rollback(false) //테스트끝났을때 rollback안함
	void selectData() {
		List<ConvTaskDeta> result = convTaskDetaRepository.findAll();
		for (ConvTaskDeta convTaskDeta : result) {

			Assertions.assertThat(convTaskDeta.getConvInstCd()).isEqualTo("R001");
			Assertions.assertThat(convTaskDeta.getConvTaskNum()).isEqualTo("TASK001");
			Assertions.assertThat(convTaskDeta.getConvTask().getConvTaskNum()).isEqualTo("TASK001");
			Assertions.assertThat(convTaskDeta.getReseRequAccNum()).isEqualTo("7162683787622");

			System.out.println("convTaskDeta.getConvInstCd() = " + convTaskDeta.getConvTaskNum());
		}
	}

	@Test
	void updateData() {
		List<ConvTaskDeta> result = convTaskDetaRepository.findAll();
		for (ConvTaskDeta convTaskDeta : result) {
			convTaskDeta.setReseRequAccNum(convTaskDeta.getReseRequAccNum() + "----Update");
			convTaskDeta.setChanDd();
			convTaskDeta.setChanTm();

			convTaskDetaRepository.save(convTaskDeta);

			Assertions.assertThat(convTaskDeta.getReseRequAccNum()).isEqualTo("7162683787622----Update");
		}
	}

	@Test
	void updateOne() {
		ConvTaskDeta convTaskDeta = convTaskDetaRepository.findByConvTaskNum("TASK001");

		Assertions.assertThat(convTaskDeta.getConvTaskNum()).isEqualTo("TASK001");
		Assertions.assertThat(convTaskDeta.getConvTaskNum()).isNotEqualTo("TASK002");
	}

}
