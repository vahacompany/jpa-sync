package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 과제집행요청상세정보 */
@Entity
@Table(name="TB_EXEC_REQU_DETA")
@AttributeOverride(name = "id", column = @Column(name = "RDETA_ID"))
public class ExecRequDeta extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@JsonProperty
	private long id;          // 과제집행요청상세T

	@Column(nullable = false, length=10)	@JsonProperty
	private ExecRequ execRequ;       // 과제집행요청T

	@Column(nullable = false, length=10)	@JsonProperty
	private String convInstCd;      // 협약_기관_코드

	@Column(nullable = false, length=30)	@JsonProperty
	private String convTaskNum;     // 협약_과제_번호

	@Column(nullable = false, length=8)	@JsonProperty
	private String execRequDd;      // 집행_요청_일자

	@Column(nullable = false, length=20)	@JsonProperty
	private String regiSeri;         // 등록_일련번호

	@Column(nullable = false)	@JsonProperty
	private int orde;              // 순번

	@Column(nullable = false, length=100)	@JsonProperty
	private String itemNm;           // 품목_명

	@Column(nullable = false, length=100)	@JsonProperty
	private String stan;              // 규격

	@Column(nullable = false)	@JsonProperty
	private String quan;              // 수량

	@Column(nullable = false)	@JsonProperty
	private float unitPric;         // 단가

	@Column(nullable = false)	@JsonProperty
	private float supyAmt;          // 공급_금액

	@Column(nullable = false)	@JsonProperty
	private float vat;               // 부가세   

	@Column(nullable = false)	@JsonProperty
	private long totaPurcAmt;     // 총_구입_금액

	@Column(nullable = false, length=30)	@JsonProperty
	private String etaxApprNum;     // 전자세금계산서_승인_번호

	@Column(nullable = false, length=100)	@JsonProperty
	private String supyPrsn;         // 공급_자

	@Column(nullable = false, length=10)	@JsonProperty
	private String supyPrsnBizNum; // 공급자_사업자_번호

	@Column(nullable = false, length=20)	@JsonProperty
	private String ntisRegiNum;     // NTIS_등록번호

	@Column(nullable = false, length=8)	@JsonProperty
	private String inspDd;           // 검수_일자

	@Column(nullable = false, length=100)	@JsonProperty
	private String inspPrsn;         // 검수_자

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

	public int getOrde() {
		return orde;
	}

	public void setOrde(int orde) {
		this.orde = orde;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public String getQuan() {
		return quan;
	}

	public void setQuan(String quan) {
		this.quan = quan;
	}

	public float getUnitPric() {
		return unitPric;
	}

	public void setUnitPric(float unitPric) {
		this.unitPric = unitPric;
	}

	public float getSupyAmt() {
		return supyAmt;
	}

	public void setSupyAmt(float supyAmt) {
		this.supyAmt = supyAmt;
	}

	public float getVat() {
		return vat;
	}

	public void setVat(float vat) {
		this.vat = vat;
	}

	public long getTotaPurcAmt() {
		return totaPurcAmt;
	}

	public void setTotaPurcAmt(long totaPurcAmt) {
		this.totaPurcAmt = totaPurcAmt;
	}

	public String getEtaxApprNum() {
		return etaxApprNum;
	}

	public void setEtaxApprNum(String etaxApprNum) {
		this.etaxApprNum = etaxApprNum;
	}

	public String getSupyPrsn() {
		return supyPrsn;
	}

	public void setSupyPrsn(String supyPrsn) {
		this.supyPrsn = supyPrsn;
	}

	public String getSupyPrsnBizNum() {
		return supyPrsnBizNum;
	}

	public void setSupyPrsnBizNum(String supyPrsnBizNum) {
		this.supyPrsnBizNum = supyPrsnBizNum;
	}

	public String getNtisRegiNum() {
		return ntisRegiNum;
	}

	public void setNtisRegiNum(String ntisRegiNum) {
		this.ntisRegiNum = ntisRegiNum;
	}

	public String getInspDd() {
		return inspDd;
	}

	public void setInspDd(String inspDd) {
		this.inspDd = inspDd;
	}

	public String getInspPrsn() {
		return inspPrsn;
	}

	public void setInspPrsn(String inspPrsn) {
		this.inspPrsn = inspPrsn;
	}

}
