package com.vaha.jpaSync.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.domain.ConvTaskDeta;
import com.vaha.jpaSync.service.ConvTaskServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
@WebAppConfiguration
class ConvTaskControllerTest {
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@MockBean
	ConvTaskServiceImpl convTaskService;

	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objectMapper; // 스프링 부트에서 기본적으로 제공해줌. 그냥 쓰면됌. json 맵핑할때 유용.
	
	// 협약_과제_번호
	static String lConvTaskNum = "convTaskController Test용";
	
	static ConvTask convTask;
	static ConvTaskDeta convTaskDeta;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("->->->-> setUp() 실행");
//		mockMvc = MockMvcBuilders.standaloneSetup(ConvTaskController.class)
//				.alwaysExpect(MockMvcResultMatchers.status().isOk()).build();
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
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

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown() 실행 <-<-<-<-");
	}

	@Test
	void testGetTest() throws Exception {
		System.out.println("testGetTest()===========================");

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getTest")
				.accept(MediaType.TEXT_HTML))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();

		String rtnVal = (String) result.getModelAndView().getModel().get("result");

		System.out.println("testGetTest()====" + rtnVal);
	}

	// List<ConvTask>
	@Test
	void testGetConvTasks() throws Exception {
		System.out.println("testGetConvTasks()===========================");
		List<ConvTask> convTaskList = new ArrayList<ConvTask>();
		
		convTask.setConvTaskNum("convTaskControllerTest-1111111");
		convTask.setConvTaskDeta(convTaskDeta);
		convTaskList.add(convTask);
		
		convTask.setConvTaskDeta(convTaskDeta);
		convTask.setConvTaskNum("convTaskControllerTest-2222222");
		convTaskList.add(convTask);
		
		when(convTaskService.getConvTasks()).thenReturn(convTaskList);
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getConvTasks").accept(MediaType.ALL))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
		 
		assertEquals(convTaskList.size(), (Integer) result.getModelAndView().getModel().get("size"));

		List<ConvTask> convTasks = new ArrayList<>();
		List<?> tempList = (List<?>) result.getModelAndView().getModel().get("data");
		for (Object obj:tempList) {
			if (obj instanceof ConvTask)
				convTasks.add((ConvTask)obj);
		}

		for (ConvTask convTask : convTasks) {
			System.out.println("convTask.getConvTaskNum ====" + convTask.getConvTaskNum());
			System.out.println("convTask.convTaskDeta.getConvTaskNum ====" + convTask.getConvTaskDeta().getConvTaskNum());
		}

	};

	// public List<ConvTask>
	void testGetConvTasksOfConvYy() throws Exception {
		// String convYear
	};

	// public ConvTask
	void testGetConvTaskOfConvTaskNum() throws Exception {
		// String convTaskNum
	}

	// public ConvTask
	void testGetConvTaskInfoOfId() throws Exception {
		// long taskId
	};

	// public List<ConvTask>
	void testGetConvTasksOfRrRese() throws Exception {
		// String rrReseRegiNum
	}

	// public List<ConvTask>
	void testGetConvTasksOfConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat() throws Exception {
		// String convInstCd, String convTaskNum, String rrReseRegiNum, String
		// taskConvYy, String taskStat
	}

	// public List<ConvTask>
	void testGetConvTasksOfConditionCustom() throws Exception {
		// String convInstCd, String convTaskNum, String rrReseRegiNum, String
		// taskConvYy, String taskStat
	}

	// public int
	void testSaveConvTaskList() throws Exception {
		// List<ConvTask> convTask
	}

	// public ConvTask
	void testSaveConvTask() throws Exception {
		// ConvTask convTask
	}

	// public int
	void testDeleteConvTaskList() throws Exception {
		// List<ConvTask> convTasks
	}

	// public int
	void testDeleteConvTask() throws Exception {
		// ConvTask convTask
	}

}
