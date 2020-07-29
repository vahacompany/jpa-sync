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
	public List<ConvTask> getConvTasks() {
		return convTaskRepository.findAll();
	}

	@Override
	public ConvTask getConvTaskInfoOfId(long taskId) {
		ConvTask convTask = convTaskRepository.findById(taskId).get();
		return convTask;
	}

	@Override
	public List<ConvTask> getConvTasksOfRrRese(String rrReseRegiNum) {
		return convTaskRepository.findByRrReseRegiNum(rrReseRegiNum);
	}

	@Override
	public List<ConvTask> getConvTasksOfConvYy(String convYear) {
		return convTaskRepository.findByTaskConvYy(convYear);
	}
	
	@Override
	public ConvTask getConvTaskOfConvTaskNum(String convTaskNum) {
		
		return convTaskRepository.findByConvTaskNum(convTaskNum);
	}

	@Override
	public List<ConvTask> getConvTasksOfConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(String convInstCd,
			String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat) {
		List<ConvTask> convTasks = convTaskRepository
				.findByConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(convInstCd, convTaskNum,
						rrReseRegiNum, taskConvYy, taskStat);
		return convTasks;
	}

	@Override
	public List<ConvTask> getConvTasksOfConditionCustom(String convInstCd, String convTaskNum, String rrReseRegiNum,
			String taskConvYy, String taskStat) {
		List<ConvTask> convTasks = convTaskRepository.findByConditionCustom(convInstCd, convTaskNum, rrReseRegiNum,
				taskConvYy, taskStat);
		return convTasks;
	}
	
	@Override
	public int saveConvTask(List<ConvTask> convTasks) {

		for (ConvTask convTask : convTasks) {
			this.saveConvTask(convTask);
		}

		return convTasks.size();
	}
	
	@Override
	public ConvTask saveConvTask(ConvTask convTask) {
		
		return convTaskRepository.save(convTask);
	}

	@Override
	public int deleteConvTask(List<ConvTask> convTasks) {

		for (ConvTask convTask : convTasks) {
			this.deleteConvTask(convTask);
		}

		return convTasks.size();
	}
	
	@Override
	public int deleteConvTask(ConvTask convTask) {
		
		convTaskRepository.delete(convTask);
		
		return 1;
	}
}
