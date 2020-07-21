package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 협약과제정부출연금정보 */
@Entity
@Table(name="TB_CONV_CONT")
@AttributeOverride(name = "id", column = @Column(name = "CONT_ID"))
public class ConvCont extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id; // 협약과제정부출연금T
	
	@Column(nullable=false)	@JsonProperty
	//@ManyToOne @JoinColumn(name = "TASK_ID")
	private ConvTask convTask; // 협약기관과제
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String conv_inst_cd; // 협약_기관_코드
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String conv_task_num; // 협약_과제_번호
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String orde_regi_num; // 차수_등록_번호
	
	@Column(nullable=false, length=8)	@JsonProperty
	private String paym_dd; // 지급_일자
	
	@Column(nullable=false)	@JsonProperty
	private long gov_amt; // 정부_출연금


}
