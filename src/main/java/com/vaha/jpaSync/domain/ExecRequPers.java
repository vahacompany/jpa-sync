package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 과제집행요청해당자정보 */
@Entity
@Table(name="TB_EXEC_REQU_PERS")
@AttributeOverride(name = "id", column = @Column(name = "PERS_ID"))
public class ExecRequPers extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id;       // 과제집행요청해당자T_아이디 

	@Column(nullable = false, length=10)	@JsonProperty
	private ExecRequ execRequ;       // 과제집행요청T

	@Column(nullable = false, length=10)	@JsonProperty
	private String convInstCd;  // 협약_기관_코드

	@Column(nullable = false, length=30)	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length=8)	@JsonProperty
	private String execRequDd;  // 집행_요청_일자

	@Column(nullable = false, length=20)	@JsonProperty
	private String regiSeri;     // 등록_일련_번호

	@Column(nullable = false)	@JsonProperty
	private int regiOrde;     // 등록_순번

	@Column(nullable = false, length=10)	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호

	@Column(nullable = false, length=100)	@JsonProperty
	private String belo;          // 소속

	@Column(nullable = false, length=20)	@JsonProperty
	private String nm;            // 성명

	@Column(nullable = false, length=8)	@JsonProperty
	private String periStDd;    // 기간_시작_일자

	@Column(nullable = false, length=8)	@JsonProperty
	private String periEdDd;       // 기간_종료_일자

	@Column(nullable = false, length=100)	@JsonProperty
	private String depaPlac;     // 출발_장소

	@Column(nullable = false, length=100)	@JsonProperty
	private String arriPlac;     // 도착_장소

	@Column(nullable = false, length=100)	@JsonProperty
	private String educNm;       // 교육_기관_명

	@Column(nullable = false, length=8)	@JsonProperty
	private String specDd;       // 특근_일자

	@Column(nullable = false, length=6)	@JsonProperty
	private String specTm;       // 특근_시간

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ExecRequ getExecRequ() {
		return execRequ;
	}

	public void setExecRequ(ExecRequ execRequ) {
		this.execRequ = execRequ;
	}

	public String getConvInstCd() {
		return convInstCd;
	}

	public void setConvInstCd(String convInstCd) {
		this.convInstCd = convInstCd;
	}

	public String getConvTaskNum() {
		return convTaskNum;
	}

	public void setConvTaskNum(String convTaskNum) {
		this.convTaskNum = convTaskNum;
	}

	public String getExecRequDd() {
		return execRequDd;
	}

	public void setExecRequDd(String execRequDd) {
		this.execRequDd = execRequDd;
	}

	public String getRegiSeri() {
		return regiSeri;
	}

	public void setRegiSeri(String regiSeri) {
		this.regiSeri = regiSeri;
	}

	public int getRegiOrde() {
		return regiOrde;
	}

	public void setRegiOrde(int regiOrde) {
		this.regiOrde = regiOrde;
	}

	public String getReseRegiNum() {
		return reseRegiNum;
	}

	public void setReseRegiNum(String reseRegiNum) {
		this.reseRegiNum = reseRegiNum;
	}

	public String getBelo() {
		return belo;
	}

	public void setBelo(String belo) {
		this.belo = belo;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getPeriStDd() {
		return periStDd;
	}

	public void setPeriStDd(String periStDd) {
		this.periStDd = periStDd;
	}

	public String getPeriEdDd() {
		return periEdDd;
	}

	public void setPeriEdDd(String periEdDd) {
		this.periEdDd = periEdDd;
	}

	public String getDepaPlac() {
		return depaPlac;
	}

	public void setDepaPlac(String depaPlac) {
		this.depaPlac = depaPlac;
	}

	public String getArriPlac() {
		return arriPlac;
	}

	public void setArriPlac(String arriPlac) {
		this.arriPlac = arriPlac;
	}

	public String getEducNm() {
		return educNm;
	}

	public void setEducNm(String educNm) {
		this.educNm = educNm;
	}

	public String getSpecDd() {
		return specDd;
	}

	public void setSpecDd(String specDd) {
		this.specDd = specDd;
	}

	public String getSpecTm() {
		return specTm;
	}

	public void setSpecTm(String specTm) {
		this.specTm = specTm;
	}

}
