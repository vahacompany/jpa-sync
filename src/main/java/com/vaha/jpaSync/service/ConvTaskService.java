package com.vaha.jpaSync.service;

import java.util.List;

import com.vaha.jpaSync.domain.ConvTask;

public interface ConvTaskService {

	public List<ConvTask> getConvTaskTotList();
	public List<ConvTask> getConvTaskToConvYy(String convYear);
	public ConvTask getConvTaskInfo(long taskId);
	public List<ConvTask> getConvTaskListOfRrRese(String rrReseRegiNum);
}