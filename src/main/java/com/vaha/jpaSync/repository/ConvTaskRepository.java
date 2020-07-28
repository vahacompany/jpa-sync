package com.vaha.jpaSync.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vaha.jpaSync.domain.ConvTask;

public interface ConvTaskRepository extends JpaRepository<ConvTask, Long> {
	public ConvTask findByConvInstCd(String convInstCd);

	public List<ConvTask> findByTaskConvYy(String convYear);

	public List<ConvTask> findByRrReseRegiNum(String rrReseRegiNum);

	public List<ConvTask> findByConvInstCdAndConvTaskNumAndRrReseRegiNumAndTaskConvYyAndTaskStat(String convInstCd,
			String convTaskNum, String rrReseRegiNum, String taskConvYy, String taskStat);

	@Query("select c, d, m from ConvTask c "
			+ "join c.convTaskDeta d "
			+ "join c.convTaskMembs m "
			+ "join c.convTaskBudgs b "
			+ "where c.convInstCd like %?1% "
			+ "and c.convTaskNum like %?2% "
			+ "and c.rrReseRegiNum like %?3% "
			+ "and c.taskConvYy like %?4% "
			+ "and c.taskStat like %?5%")
	public List<ConvTask> findByConditionCustom(String convInstCd, String convTaskNum, String rrReseRegiNum,
			String taskConvYy, String taskStat);

}
