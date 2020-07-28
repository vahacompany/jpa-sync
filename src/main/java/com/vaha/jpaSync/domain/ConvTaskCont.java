package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 협약과제정부출연금정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_TASK_CONT")
public class ConvTaskCont extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONT_ID")
	@JsonProperty
	private long id; // 협약과제정부출연금T

	@Column(nullable = false)
	@JsonProperty
	private String taskId; // 협약기관과제T아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 20)
	@JsonProperty
	private String paymOrde; // 지급_차수

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String paymDd; // 지급_일자

	@Column(nullable = false)
	@JsonProperty
	private long govAmt; // 정부_출연금

	@Builder
	public ConvTaskCont(String pTaskId, String pConvInstCd, String pConvTaskNum, String pPaymOrde, String pPaymDd,
			long pGovAmt) {
		this.taskId = pTaskId;
		this.convInstCd = pConvInstCd;
		this.convTaskNum = pConvTaskNum;
		this.paymOrde = pPaymOrde;
		this.paymDd = pPaymDd;
		this.govAmt = pGovAmt;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
