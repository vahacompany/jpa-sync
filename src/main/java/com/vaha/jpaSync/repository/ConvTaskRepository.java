package com.vaha.jpaSync.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaha.jpaSync.domain.ConvTask;

public interface ConvTaskRepository extends JpaRepository<ConvTask, Long> {
	public ConvTask findByConvInstCd(String convInstCd);
	public List<ConvTask> findByTaskConvYy(String convYear);
	public List<ConvTask> findByRrReseRegiNum(String rrReseRegiNum);
}
