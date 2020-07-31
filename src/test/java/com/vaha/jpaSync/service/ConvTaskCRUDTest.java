package com.vaha.jpaSync.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.domain.ConvTaskDeta;
import com.vaha.jpaSync.repository.ConvTaskDetaRepository;
import com.vaha.jpaSync.repository.ConvTaskRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConvTaskCRUDTest {

	@Autowired
	ConvTaskServiceImpl convTaskService;
	@Autowired
	ConvTaskRepository convTaskRepository;
	@Autowired
	ConvTaskDetaRepository convTaskDetaRepository;
	
	// 협약_과제_번호
	static String lConvTaskNum = "TASK999";
	
	static ConvTask convTask;
	static ConvTaskDeta convTaskDeta;

	@BeforeAll
	static void setUp() throws Exception {
		// 정보 생성
		convTask = ConvTask.builder().pConvInstCd("R999") // 협약_기관_코드
				.pConvTaskNum(lConvTaskNum) // 협약_과제_번호
				.pConvTaskNm("협약과제 등록테스트") // 협약_과제명
				.pBimokGrouCd("BM999") // 비목그룹코드
				.pRrReseRegiNum("9999999999") // 책임연구자 연구자등록번호
				.pRrNm("테스트성명").pTaskConvYy("2020")// 협약년도
				.pCurrRechStDd("20200101")// 당해년도 연구수행 시작일자
				.pCurrRechEdDd("20201231")// 당해년도 연구수행 종료일자
				.pTaskStat("99")// 과제상태
				.build();

		convTaskDeta = ConvTaskDeta.builder().pConvInstCd("R999") // 협약_기관_코드
				.pConvTaskNum(lConvTaskNum) // 협약_과제_번호
				.pBimokGrouBizNm("비목구분사업명칭") // 비목_구분_사업_명
				.pBizClasCd("BIZ001") // 사업_분류_코드
				.pTechFielCd("TEAC01") // 기술_분야_코드
				.pTotaRechStDd("20190101") // 총_연구_시작_일자
				.pTotaRechEdDd("20211231") // 총_연구_종료_일자
				.pCurrRechDevpAmt(100000000) // 당해_연구_개발비
				.pCurrGovAmt(50000000) // 해_정부_출연금
				.pCurrGovNonAmt(20000000) // 당해_정부_외_출연금
				.pCurrCorpCash(10000000) // 당해_기업_부담금_현금
				.pCurrCorpStuf(20000000) // 당해_기업_부담금_현물
				.pOtheCounCash(0) // 상대_국가_부담금
				.pCarrCash(1000000) // 이월_현금
				.pCarrStuf(1200000) // 이월_현물
				.pInteCash(100000) // 이자_현금
				.pInteStuf(120000) // 이자_현물
				.pReseRequBkCd("082") // 연구비_청구_은행_코드
				.pReseRequAccNum("7162683787622") // 연구비_청구_계좌_번호
				.pReseRequAccHold("홍길동") // 연구비_청구_계좌_예금주
				.pReseCardBkCd("082") // 연구비_카드_은행_코드
				.pReseCardPaymAccNum("738927923494") // 연구비_카드_결제_계좌_번호
				.pReseCardPaymAccHold("박길동") // 연구비_카드_결제_계좌_예금주
				.pReseInstBizRegiNum("1028377480") // 연구_수행기관_사업자_등록번호
				.pReseInstTypeCd("10") // 연구_수행기관_구분_코드
				.pReseInstCorpEngNm("수행기관영문") // 연구_수행기관_법인_영문_명
				.build();
	}

	/* 1. 협약과제기본_상세_CRUD */
	/* 2. 협약과제_참여연구둰_CRUD */
	/* 3. 협약과제_예산정보_CRUD */
	/* 4. 협약과제_정부툴연금_CRUD */
	/* 5. 협약과제_발급카드정보_CRUD */
	/* 6. 협약기관_과제기본_상세_CRUD */

	@Test
	void test협약과제기본_상세_CRUD() {

		convTaskDeta.setConvTask(convTask);
		convTask.setConvTaskDeta(convTaskDeta);

		List<ConvTask> convTasks = new ArrayList<ConvTask>();

		convTasks.add(convTask);

		convTaskService.saveConvTask(convTasks);

		ConvTask schConvTask = convTaskService.getConvTaskOfConvTaskNum(lConvTaskNum);

		assertNotNull(schConvTask);
		assertEquals(schConvTask.getConvTaskNum(), lConvTaskNum);
		assertEquals(schConvTask.getConvTaskDeta().getConvTaskNum(), lConvTaskNum);

		// 정보변경
		schConvTask.getConvTaskDeta().setBimokGrouBizNm("비목구분사업명_변경");
		schConvTask.setConvTaskNm("협약과제 변경테스트");

		ConvTask updConvTask = convTaskService.saveConvTask(schConvTask);

		assertNotNull(updConvTask);
		assertEquals(updConvTask.getConvTaskNum(), lConvTaskNum);
		assertEquals(updConvTask.getConvTaskDeta().getConvTaskNum(), lConvTaskNum);
		assertEquals(updConvTask.getConvTaskNm(), "협약과제 변경테스트");
		assertEquals(updConvTask.getConvTaskDeta().getBimokGrouBizNm(), "비목구분사업명_변경");

		// 정보삭제
		int cnt = convTaskService.deleteConvTask(updConvTask);

		assertEquals(cnt, 1);
		assertEquals(convTaskService.getConvTaskOfConvTaskNum(lConvTaskNum), null);

		// 다중등록
		convTasks = new ArrayList<ConvTask>();
		convTask.setConvTaskDeta(convTaskDeta);
		convTasks.add(convTask);
		convTask.setConvTaskDeta(convTaskDeta);
		convTasks.add(convTask);

		int saveCnt = convTaskService.saveConvTask(convTasks);

		assertEquals(saveCnt, 2);

		// 다중삭제
		convTasks = new ArrayList<ConvTask>();
		convTasks = convTaskService.getConvTasksOfConditionCustom("", lConvTaskNum, "", "", "");
		
		int deleteCnt = convTaskService.deleteConvTask(convTasks);

		assertEquals(deleteCnt, 2);

	}

}
