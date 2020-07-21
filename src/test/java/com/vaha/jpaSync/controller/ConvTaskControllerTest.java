package com.vaha.jpaSync.controller;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaha.jpaSync.service.ConvTaskServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest // @SpringBootApplication 찾아서 밑에
@AutoConfigureMockMvc
@Ignore // 테스트로 간주하지 않음
@ActiveProfiles("dev")
class ConvTaskControllerTest {

	@InjectMocks
	private ConvTaskController controller;
	private MockMvc mockMvc;

	@MockBean
	private ConvTaskServiceImpl convTaskService;

	@Autowired
	ObjectMapper objectMapper; // 스프링 부트에서 기본적으로 제공해줌. 그냥 쓰면됌. json 맵핑할때 유용.

	@BeforeEach
	void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(ConvTaskController.class).build();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetConvTaskList() throws Exception {

		System.out.println("testGetConvTaskList()===========================");
		
		mockMvc.perform(MockMvcRequestBuilders.get("/convTaskList").accept(MediaType.TEXT_HTML))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.model().attribute("taskId", 86L))
		.andDo(MockMvcResultHandlers.print());

		// fail("Not yet implemented");
	}

}
