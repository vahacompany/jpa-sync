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
	public List<ConvTask> getConvTaskList() {
		return convTaskRepository.findAll();
	}

}
