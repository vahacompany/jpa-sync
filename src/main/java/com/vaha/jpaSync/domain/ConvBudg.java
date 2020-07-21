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

/* 협약과제예산정보 */
@Entity
@Table(name="TB_CONV_BUDG")
@AttributeOverride(name = "id", column = @Column(name = "BUDG_ID"))
public class ConvBudg extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id	@GeneratedValue	@JsonProperty
	private long id;           // 테이블ID
	
	@Column(nullable=false)	@JsonProperty 
	//@ManyToOne @JoinColumn(name = "TASK_ID")
	private ConvTask convTask; // 협약기관과제
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String convInstCd; // 협약_기관_코드
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String convTaskNm; // 협약_과제_번호
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String bimokCd;    // 비목_코드
	
	@Column(nullable=false)	@JsonProperty
	private long cash;         // 현금
	
	@Column(nullable=false)	@JsonProperty
	private long stuf;         // 현물
	
	@Column(nullable=false)	@JsonProperty
	private long carrCash;     // 이월_현금
	
	@Column(nullable=false)	@JsonProperty
	private long carrStuf;     // 이월_현물
	
	@Column(nullable=false)	@JsonProperty
	private long inteCash;     // 이자_현금
	
	@Column(nullable=false)	@JsonProperty
	private long inteStuf;     // 이자_현물

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

	public String getConvInstCd() {
		return convInstCd;
	}

	public void setConvInstCd(String convInstCd) {
		this.convInstCd = convInstCd;
	}

	public String getConvTaskNm() {
		return convTaskNm;
	}

	public void setConvTaskNm(String convTaskNm) {
		this.convTaskNm = convTaskNm;
	}

	public String getBimokCd() {
		return bimokCd;
	}

	public void setBimokCd(String bimokCd) {
		this.bimokCd = bimokCd;
	}

	public long getCash() {
		return cash;
	}

	public void setCash(long cash) {
		this.cash = cash;
	}

	public long getStuf() {
		return stuf;
	}

	public void setStuf(long stuf) {
		this.stuf = stuf;
	}

	public long getCarrCash() {
		return carrCash;
	}

	public void setCarrCash(long carrCash) {
		this.carrCash = carrCash;
	}

	public long getCarrStuf() {
		return carrStuf;
	}

	public void setCarrStuf(long carrStuf) {
		this.carrStuf = carrStuf;
	}

	public long getInteCash() {
		return inteCash;
	}

	public void setInteCash(long inteCash) {
		this.inteCash = inteCash;
	}

	public long getInteStuf() {
		return inteStuf;
	}

	public void setInteStuf(long inteStuf) {
		this.inteStuf = inteStuf;
	}

}
