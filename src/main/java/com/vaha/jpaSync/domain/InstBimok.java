package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 협약기관비목정보 */
@Entity
@Table(name="TB_CONV_BIMOK")
@AttributeOverride(name = "id", column = @Column(name = "BIMOK_ID"))
public class InstBimok extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue	@JsonProperty
	private long id;  // 테이블아이디

	@Column(nullable=false, length=10)	@JsonProperty
	private String convInstCCd; // 협약_기관_코드

	@Column(nullable=true, length=100)	@JsonProperty
	private String convInstNm; // 협약_기관_명

	@Column(nullable=false, length=6)	@JsonProperty
	private String bimokGrouCd; // 비목_그룹_코드

	@Column(nullable=true, length=10)	@JsonProperty
	private String upBimokCd; // 상위_비목_코드

	@Column(nullable=false, length=10)	@JsonProperty
	private String bimokCd; // 비목_코드

	@Column(nullable=false, length=100)	@JsonProperty
	private String bimokNm; // 비목_명

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConvInstCCd() {
		return convInstCCd;
	}

	public void setConvInstCCd(String convInstCCd) {
		this.convInstCCd = convInstCCd;
	}

	public String getConvInstNm() {
		return convInstNm;
	}

	public void setConvInstNm(String convInstNm) {
		this.convInstNm = convInstNm;
	}

	public String getBimokGrouCd() {
		return bimokGrouCd;
	}

	public void setBimokGrouCd(String bimokGrouCd) {
		this.bimokGrouCd = bimokGrouCd;
	}

	public String getUpBimokCd() {
		return upBimokCd;
	}

	public void setUpBimokCd(String upBimokCd) {
		this.upBimokCd = upBimokCd;
	}

	public String getBimokCd() {
		return bimokCd;
	}

	public void setBimokCd(String bimokCd) {
		this.bimokCd = bimokCd;
	}

	public String getBimokNm() {
		return bimokNm;
	}

	public void setBimokNm(String bimokNm) {
		this.bimokNm = bimokNm;
	}
	
}
