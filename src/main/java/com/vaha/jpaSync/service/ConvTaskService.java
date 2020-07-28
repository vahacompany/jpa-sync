package com.vaha.jpaSync.service;

import java.util.List;

import com.vaha.jpaSync.domain.ConvTask;

public interface ConvTaskService {

	public List<ConvTask> getConvTaskTotList();
	public List<ConvTask> getConvTaskToConvYy(String convYear);
	public ConvTask getConvTaskInfoOfId(long taskId);
	public List<ConvTask> getConvTaskListOfRrRese(String rrReseRegiNum);
	
	public List<ConvTask> findByConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(String convInstCd, String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat);
	public List<ConvTask> findByConditionCustom(String convInstCd, String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat);
	
	public int saveConvTask(List<ConvTask> convTasks);
}