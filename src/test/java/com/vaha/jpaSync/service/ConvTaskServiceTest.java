package com.vaha.jpaSync.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.repository.ConvTaskRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConvTaskServiceTest {
	
	@Autowired ConvTaskServiceImpl convTaskService;
	@Autowired ConvTaskRepository convTaskRepository;

	@BeforeAll
	void setUp() throws Exception {
		
	}

	@AfterAll
	void tearDown() throws Exception {
	}

	@Test
	void testGetConvTaskList() {
		
		List<ConvTask> result = convTaskService.getConvTaskList();
		
		System.out.println("convTask Size() => "+result.size());
		
		assertNotNull(result);
		assertEquals(result.size(), 3);
		
		for(ConvTask convTask:result) {
			System.out.println("convTask.getId() => "+convTask.getId());
		}
	}

}
