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

/* 협약과제발급카드정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_TASK_CARD")
public class ConvTaskCard extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TACA_ID")
	@JsonProperty
	private long id; // 협약과제발급카드T

	@Column(nullable = false)
	@JsonProperty
	private ConvTask convTask; // 협약기관과제T

	@Column(nullable = false)
	@JsonProperty
	private CardIssu cardIssu; // 카드발급T

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstcd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Builder
	public ConvTaskCard(ConvTask convTask, CardIssu cardIssu, String convInstcd, String convTaskNum, String cardNum) {
		this.convTask = convTask;
		this.cardIssu = cardIssu;
		this.convInstcd = convInstcd;
		this.convTaskNum = convTaskNum;
		this.cardNum = cardNum;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 변경_일자
		this.setChanTm(); // 변경_시간
	}
}
