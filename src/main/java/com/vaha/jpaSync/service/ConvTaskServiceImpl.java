package com.vaha.jpaSync.service;

import java.util.List;
import java.util.Optional;

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
	public ConvTask getConvTaskInfo(long taskId) {

		Optional<ConvTask> convTask = convTaskRepository.findById(taskId);
		return convTask.get();
	}

	@Override
	public List<ConvTask> getConvTaskListOfRrRese(String rrReseRegiNum) {

		return convTaskRepository.findByRrReseRegiNum(rrReseRegiNum);

	}

	@Override
	public List<ConvTask> getConvTaskToConvYy(String convYear) {

		return convTaskRepository.findByTaskConvYy(convYear);
	}

}
