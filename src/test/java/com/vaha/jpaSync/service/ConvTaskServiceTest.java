package com.vaha.jpaSync.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.domain.ConvTaskBudg;
import com.vaha.jpaSync.domain.ConvTaskCard;
import com.vaha.jpaSync.domain.ConvTaskCont;
import com.vaha.jpaSync.domain.ConvTaskMemb;
import com.vaha.jpaSync.repository.ConvTaskRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConvTaskServiceTest {

	@Autowired
	ConvTaskServiceImpl convTaskService;
	@Autowired
	ConvTaskRepository convTaskRepository;

	// @BeforeAll
	void setUp() throws Exception {
		System.out.println("@BeforeAll---");
	}

	// @AfterAll
	void tearDown() throws Exception {
		System.out.println("@AfterAll---");
	}

	/*
	 * 1. 협약기관 과제목록 조회 전체 2. 과제번호로 과제정보 조회 3. 협약기관 과제목록 조건별
	 * 조회(협약중,과제수행중,과제종료(정산전),과제종류(정산중),과재종료(정산완료)) 4. 협약기관 년도별 과제목록 조회 5. 연구책임자별
	 * 과제목록 조회 6. 과제번호로 과제얘산정보조회 7. 과제번호로 참여연구원정보조회 8. 과제번호로 정부출연금정보조회 9.과제번호로 과제별
	 * 발급카드 조회 10.과제번호로 과제전체정보조회 11.과제기본정보 등록/수정/삭제 12.과제상셍정보 등록/수정/삭제
	 */

	@Test
	void test협약기관_과제목록_조회_전체() {

		List<ConvTask> result = convTaskService.getConvTaskTotList();

		assertNotNull(result);
		int cnt = 0;

		for (ConvTask convTask : result) {
			if (cnt > 4)
				break;

			assertNotNull(convTask.getConvTaskDeta());
			assertEquals(convTask.getId(), convTask.getConvTaskDeta().getId());
			assertEquals(convTask.getConvInstCd(), convTask.getConvTaskDeta().getConvInstCd());
			assertEquals(convTask.getConvTaskNum(), convTask.getConvTaskDeta().getConvTaskNum());

			cnt++;
		}

	}

	@Test
	void test과제번호로_과제정보_조회() {

		ConvTask convTask = convTaskService.getConvTaskInfo(1L);

		assertNotNull(convTask);
		assertEquals(convTask.getId(), 1L);

		assertNotNull(convTask.getConvTaskDeta());
		assertEquals(convTask.getConvTaskDeta().getId(), 1L);

	}

	// @Test
	void test_협약기관_과제목록_조건별_조회() {
		fail("Not yet!");
	}

	@Test
	void test협약기관_년도별_과제목록_조회() {

		List<ConvTask> result = convTaskService.getConvTaskToConvYy("2018");

		assertNotNull(result);

		for (ConvTask convTask : result) {
			assertThat(convTask.getConvTaskNum().startsWith("2018"));
		}

	}

	@Test
	void test연구책임자별_과제목록_조회() {

		List<ConvTask> result = convTaskRepository.findByRrReseRegiNum("1000000001");

		assertNotNull(result);
		assertEquals(result.size(), 2);

		for (ConvTask convTask : result) {
			assertEquals(convTask.getRrReseRegiNum(), "1000000001");
		}

	}

	@Test
	@Transactional
	void test과제번호로_과제예산정보조회() {

		ConvTask convTask = convTaskRepository.findById(1L).get();

		assertNotNull(convTask);

		List<ConvTaskBudg> result = convTask.getConvTaskBudgs();

		for (ConvTaskBudg convTaskBudg : result) {
			if (convTaskBudg.getId() == 1L) {
				assertEquals(convTaskBudg.getConvInstCd(), "A001");
				assertEquals(convTaskBudg.getConvTaskNum(), "20180001");
			}
		}

	}

	@Test
	@Transactional
	void test과제번호로_참여연구원정보조회() {

		ConvTask convTask = convTaskRepository.findById(1L).get();

		assertNotNull(convTask);

		List<ConvTaskMemb> result = convTask.getConvTaskMembs();

		for (ConvTaskMemb convTaskMemb : result) {
			if (convTaskMemb.getId() == 1L)
				assertEquals(convTaskMemb.getReseRegiNum(), "1000000001");
		}

	}

	@Test
	@Transactional
	void test과제번호로_정부출연금정보조회() {

		ConvTask convTask = convTaskRepository.findById(1L).get();

		assertNotNull(convTask);

		List<ConvTaskCont> result = convTask.getConvTaskConts();

		for (ConvTaskCont convTaskCont : result) {
			if (convTaskCont.getId() == 1L) {
				assertEquals(convTaskCont.getConvInstCd(), "A001");
				assertEquals(convTaskCont.getConvTaskNum(), "20180001");
			}
		}

	}

	@Test
	@Transactional
	void test과제번호로_과제별_발급카드_조회() {

		ConvTask convTask = convTaskRepository.findById(1L).get();

		assertNotNull(convTask);

		List<ConvTaskCard> result = convTask.getConvTaskCards();

		for (ConvTaskCard convTaskCard : result) {
			if (convTaskCard.getId() == 1L) {
				assertEquals(convTaskCard.getConvInstCd(), "A001");
				assertEquals(convTaskCard.getConvTaskNum(), "20180001");
			}
		}

	}

	// @Test
	void test과제번호로_과제전체정보조회() {
		fail("Not yet!");
	}

}
