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

@RunWith(SpringRunner.class)
@SpringBootTest
class ConvTaskRepositoryTest {

	@Autowired
	ConvTaskRepository convTaskRepository;
	
	ConvTask convTask;
	
	@BeforeEach
	void setup() {
		
		convTask = ConvTask.builder()
				.convInstCd("R001")
				.convTaskNum("TASK001")
				.convTaskNm("협약과제명")
				.bimokGrouCd("BM001")
				.rrReseRegiNum("1234567890")
				.build();

		convTaskRepository.save(convTask);

	}
	
	@AfterEach
	void tearDown() {
		List<ConvTask> result = convTaskRepository.findAll();
		System.out.print("result = "+ result.size());
		for(ConvTask convTask:result) {
			convTaskRepository.delete(convTask);
			System.out.print("convTask.getId() = "+ convTask.getId());
		}
	}
	
	@Test
	void selectData() {
		List<ConvTask> result = convTaskRepository.findAll();
		for(ConvTask convTask:result) {
			
			System.out.println(convTask.getConvInstCd());
			Assertions.assertThat(convTask.getConvInstCd()).isEqualTo("R001");
			Assertions.assertThat(convTask.getBimokGrouCd()).isEqualTo("BM001");
			Assertions.assertThat(convTask.getRrReseRegiNum()).isEqualTo("1234567890");
			
			System.out.println("convTask.getConvInstCd() = "+ convTask.getConvTaskNum());
		}
	}
	
	@Test
	void updateData() {
		List<ConvTask> result = convTaskRepository.findAll();
		for(ConvTask convTask:result) {
			convTask.setConvTaskNm(convTask.getConvTaskNm()+"----Update");
			convTask.setChanDd();
			convTask.setChanTm();
			
			convTaskRepository.save(convTask);
					
			Assertions.assertThat(convTask.getConvTaskNm()).isEqualTo("협약과제명----Update");
			Assertions.assertThat(convTask.getConvTaskNm()).isNotEqualTo("협약과제명--Update");
		}
	}
	
	@Test
	void updateOne() {
		ConvTask convTask = convTaskRepository.findByConvInstCd("R001");
		
		Assertions.assertThat(convTask.getConvInstCd()).isEqualTo("R001");
		Assertions.assertThat(convTask.getConvInstCd()).isNotEqualTo("R002");

	}

}
