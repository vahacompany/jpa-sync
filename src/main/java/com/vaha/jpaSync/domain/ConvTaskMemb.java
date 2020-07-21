package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 협약과제연구원정보 */
@Entity
@Table(name="TB_CONV_TASK_MEMB")
@AttributeOverride(name = "id", column = @Column(name = "MEMB_ID"))
public class ConvTaskMemb extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue	@JsonProperty
	private Long id;       // 테이블ID
	
	@Column(nullable=false)	@JsonProperty
	private ConvTask convTask;  // 협약기관과제
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String convInstCd;  // 협약_기관_코드
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String convTaskNum; // 협약_과제_번호
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String reseGrou;     // 연구자_구분
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String nm;            // 성명
	
	@Column(nullable=true, length=50)	@JsonProperty
	private String nmEng;        // 성명_영문
	
	@Column(nullable=false, length=8)	@JsonProperty
	private String birt;          // 생년월일
	
	@Column(nullable=true, length=100)	@JsonProperty
	private String depa;          // 소속부서
	
	@Column(nullable=true, length=40)	@JsonProperty
	private String spot;          // 직위
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String mobi;          // 핸드폰 
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String tel;           // 전화 
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String fax;           // 팩스
	
	@Column(nullable=true, length=50)	@JsonProperty
	private String email;         // 이메일
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String zip;           // 우편번호
	
	@Column(nullable=true, length=200)	@JsonProperty
	private String addr;          // 주소

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getConvTaskNum() {
		return convTaskNum;
	}

	public void setConvTaskNum(String convTaskNum) {
		this.convTaskNum = convTaskNum;
	}

	public String getReseGrou() {
		return reseGrou;
	}

	public void setReseGrou(String reseGrou) {
		this.reseGrou = reseGrou;
	}

	public String getReseRegiNum() {
		return reseRegiNum;
	}

	public void setReseRegiNum(String reseRegiNum) {
		this.reseRegiNum = reseRegiNum;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getNmEng() {
		return nmEng;
	}

	public void setNmEng(String nmEng) {
		this.nmEng = nmEng;
	}

	public String getBirt() {
		return birt;
	}

	public void setBirt(String birt) {
		this.birt = birt;
	}

	public String getDepa() {
		return depa;
	}

	public void setDepa(String depa) {
		this.depa = depa;
	}

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	public String getMobi() {
		return mobi;
	}

	public void setMobi(String mobi) {
		this.mobi = mobi;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
