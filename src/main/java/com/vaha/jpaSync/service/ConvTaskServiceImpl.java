package com.vaha.jpaSync.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaha.jpaSync.domain.ConvTask;
import com.vaha.jpaSync.repository.ConvTaskRepository;

@Service
public class ConvTaskServiceImpl implements ConvTaskService {

	@Autowired
	private ConvTaskRepository convTaskRepository;

	@Override
	public List<ConvTask> getConvTaskTotList() {
		return convTaskRepository.findAll();
	}

	@Override
	public ConvTask getConvTaskInfoOfId(long taskId) {
		ConvTask convTask = convTaskRepository.findById(taskId).get();
		return convTask;
	}

	@Override
	public List<ConvTask> getConvTaskListOfRrRese(String rrReseRegiNum) {
		return convTaskRepository.findByRrReseRegiNum(rrReseRegiNum);
	}

	@Override
	public List<ConvTask> getConvTaskToConvYy(String convYear) {
		return convTaskRepository.findByTaskConvYy(convYear);
	}

	@Override
	public int saveConvTask(List<ConvTask> convTasks) {

		for (ConvTask convTask : convTasks) {
			convTaskRepository.save(convTask);
		}

		return 0;
	}

	@Override
	public List<ConvTask> findByConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(String convInstCd,
			String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat) {
		List<ConvTask> convTasks = convTaskRepository
				.findByConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(convInstCd, convTaskNum,
						rrReseRegiNum, taskConvYy, taskStat);
		return convTasks;
	}

	@Override
	public List<ConvTask> findByConditionCustom(String convInstCd, String convTaskNum, String rrReseRegiNum,
			String taskConvYy, String taskStat) {
		List<ConvTask> convTasks = convTaskRepository.findByConditionCustom(convInstCd, convTaskNum, rrReseRegiNum,
				taskConvYy, taskStat);
		return convTasks;
	}

}
