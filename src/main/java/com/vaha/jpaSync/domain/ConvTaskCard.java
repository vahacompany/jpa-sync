package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 협약과제발급카드정보 */
@Entity
@Table(name="TB_CONV_TASK_CARD")
@AttributeOverride(name="id", column=@Column(name="TACA_ID"))
public class ConvTaskCard extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id;       // 협약과제발급카드T
	
	@Column(nullable=false)	@JsonProperty
	private ConvTask convTask;       // 협약기관과제T
	
	@Column(nullable=false)	@JsonProperty
	private CardIssu cardIssu;       // 카드발급T
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String convInstcd;  // 협약_기관_코드
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String convTaskNum; // 협약_과제_번호
	
	@Column(nullable=false, length=16)	@JsonProperty
	private String cardNum;      // 카드_번호

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ConvTask getConvTask() {
		return convTask;
	}

	public void setConvTask(ConvTask convTask) {
		this.convTask = convTask;
	}

	public CardIssu getCardIssu() {
		return cardIssu;
	}

	public void setCardIssu(CardIssu cardIssu) {
		this.cardIssu = cardIssu;
	}

	public String getConvInstcd() {
		return convInstcd;
	}

	public void setConvInstcd(String convInstcd) {
		this.convInstcd = convInstcd;
	}

	public String getConvTaskNum() {
		return convTaskNum;
	}

	public void setConvTaskNum(String convTaskNum) {
		this.convTaskNum = convTaskNum;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

}
