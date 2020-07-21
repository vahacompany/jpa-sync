package com.vaha.jpaSync.domain;

import java.sql.Clob;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 전송코드정보 */
@Entity
@Table(name="TB_TRAN_CD")
@AttributeOverride(name = "id", column = @Column(name = "TRAN_ID"))
public class TranCd extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id;   // 전송T_아이디  INT UNSIGNED NOT NULL, 

	@Column(nullable = false, length = 6)	@JsonProperty
	private String tranCd;   // 전송_코드

	@Column(nullable = true)	@JsonProperty
	private Clob tranHist; // 전송_내역

	@Column(nullable = true)	@JsonProperty
	private Clob procMeth; // 처리_방법

	@Column(nullable = true, length = 255)	@JsonProperty
	private String rema;      // 비고

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTranCd() {
		return tranCd;
	}

	public void setTranCd(String tranCd) {
		this.tranCd = tranCd;
	}

	public Clob getTranHist() {
		return tranHist;
	}

	public void setTranHist(Clob tranHist) {
		this.tranHist = tranHist;
	}

	public Clob getProcMeth() {
		return procMeth;
	}

	public void setProcMeth(Clob procMeth) {
		this.procMeth = procMeth;
	}

	public String getRema() {
		return rema;
	}

	public void setRema(String rema) {
		this.rema = rema;
	}

}
