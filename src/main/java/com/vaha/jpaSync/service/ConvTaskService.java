package com.vaha.jpaSync.service;

import java.util.List;

import com.vaha.jpaSync.domain.ConvTask;

public interface ConvTaskService {

	public List<ConvTask> getConvTasks();
	public List<ConvTask> getConvTasksOfConvYy(String convYear);
	public ConvTask getConvTaskOfConvTaskNum(String convTaskNum);
	public ConvTask getConvTaskInfoOfId(long taskId);
	public List<ConvTask> getConvTasksOfRrRese(String rrReseRegiNum);
	
	public List<ConvTask> getConvTasksOfConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(String convInstCd, String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat);
	public List<ConvTask> getConvTasksOfConditionCustom(String convInstCd, String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat);
	
	public int saveConvTask(List<ConvTask> convTasks);
	public ConvTask saveConvTask(ConvTask convTask);
	
	public int deleteConvTask(List<ConvTask> convTasks);
	public int deleteConvTask(ConvTask convTask);
}