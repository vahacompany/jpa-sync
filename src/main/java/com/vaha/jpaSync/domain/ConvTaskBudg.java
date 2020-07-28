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

/* 협약과제예산정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_TASK_BUDG")
public class ConvTaskBudg extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BUDG_ID")
	@JsonProperty
	private long id; // 테이블ID

	@Column(nullable = false)
	@JsonProperty
	private String taskId;

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String bimokCd; // 비목_코드

	@Column(nullable = false)
	@JsonProperty
	private long cash; // 현금

	@Column(nullable = false)
	@JsonProperty
	private long stuf; // 현물

	@Column(nullable = false)
	@JsonProperty
	private long carrCash; // 이월_현금

	@Column(nullable = false)
	@JsonProperty
	private long carrStuf; // 이월_현물

	@Column(nullable = false)
	@JsonProperty
	private long inteCash; // 이자_현금

	@Column(nullable = false)
	@JsonProperty
	private long inteStuf; // 이자_현물

	@Builder
	public ConvTaskBudg(String pConvInstCd, String pConvTaskNum, String pBimokCd, long pCash, long pStuf, long pCarrCash,
			long pCarrStuf, long pInteCash, long pInteStuf) {
		this.convInstCd = pConvInstCd;
		this.convTaskNum = pConvTaskNum;
		this.bimokCd = pBimokCd;
		this.cash = pCash;
		this.stuf = pStuf;
		this.carrCash = pCarrCash;
		this.carrStuf = pCarrStuf;
		this.inteCash = pInteCash;
		this.inteStuf = pInteStuf;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
