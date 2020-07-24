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
@Table(name = "TB_CONV_CONT")
public class ConvCont extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONT_ID")
	@JsonProperty
	private long id; // 협약과제정부출연금T

	@Column(nullable = false)
	@JsonProperty
	// @ManyToOne @JoinColumn(name = "TASK_ID")
	private ConvTask convTask; // 협약기관과제

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 20)
	@JsonProperty
	private String ordeRegiNum; // 차수_등록_번호

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String paymDd; // 지급_일자

	@Column(nullable = false)
	@JsonProperty
	private long govAmt; // 정부_출연금

	@Builder
	public ConvCont(ConvTask convTask, String convInstCd, String convTaskNum, String ordeRegiNum, String paymDd,
			long govAmt) {
		this.convTask = convTask;
		this.convInstCd = convInstCd;
		this.convTaskNum = convTaskNum;
		this.ordeRegiNum = ordeRegiNum;
		this.paymDd = paymDd;
		this.govAmt = govAmt;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
