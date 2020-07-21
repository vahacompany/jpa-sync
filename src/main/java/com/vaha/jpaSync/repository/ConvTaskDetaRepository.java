package com.vaha.jpaSync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaha.jpaSync.domain.ConvTaskDeta;

public interface ConvTaskDetaRepository extends JpaRepository<ConvTaskDeta, Long> {
	public ConvTaskDeta findByConvTaskNum(String convTaskNum);
}
