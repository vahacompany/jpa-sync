package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 가맹점정보 */
@Entity
@Table(name="TB_MERC")
@AttributeOverride(name="id", column=@Column(name="MERC_ID"))
public class Merc extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@JsonProperty
	private String id;        // 가맹점T
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String merc_num;      // 가맹점_번호
	
	@Column(nullable=false, length=100)	@JsonProperty
	private String merc_nm;        // 가맹점_명
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String biz_regi_num;   // 사업자_등록번호
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String busi_cd;        // 업종_코드
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String mc_cd;          // 가맹점국제업종_코드
	
	@Column(nullable=false, length=40)	@JsonProperty
	private String mc_nm;          // 가맹점국제업종_명
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String merc_tel;       // 가맹점_전화
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String merc_zip;       // 가맹점_우편번호
	
	@Column(nullable=false, length=200)	@JsonProperty
	private String merc_base_addr; // 가맹점_기본_주소
	
	@Column(nullable=false, length=200)	@JsonProperty
	private String merc_deta_addr; // 가맹점_상세_주소
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String merc_repre_nm;  // 가맹점_대표자_명
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String tax_type_cd;    // 과세_유형_코드
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String clos_whet;      // 폐업_여부
	
	@Column(nullable=false, length=8)	@JsonProperty
	private String clos_dd;        // 폐업_일자

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerc_num() {
		return merc_num;
	}

	public void setMerc_num(String merc_num) {
		this.merc_num = merc_num;
	}

	public String getMerc_nm() {
		return merc_nm;
	}

	public void setMerc_nm(String merc_nm) {
		this.merc_nm = merc_nm;
	}

	public String getBiz_regi_num() {
		return biz_regi_num;
	}

	public void setBiz_regi_num(String biz_regi_num) {
		this.biz_regi_num = biz_regi_num;
	}

	public String getBusi_cd() {
		return busi_cd;
	}

	public void setBusi_cd(String busi_cd) {
		this.busi_cd = busi_cd;
	}

	public String getMc_cd() {
		return mc_cd;
	}

	public void setMc_cd(String mc_cd) {
		this.mc_cd = mc_cd;
	}

	public String getMc_nm() {
		return mc_nm;
	}

	public void setMc_nm(String mc_nm) {
		this.mc_nm = mc_nm;
	}

	public String getMerc_tel() {
		return merc_tel;
	}

	public void setMerc_tel(String merc_tel) {
		this.merc_tel = merc_tel;
	}

	public String getMerc_zip() {
		return merc_zip;
	}

	public void setMerc_zip(String merc_zip) {
		this.merc_zip = merc_zip;
	}

	public String getMerc_base_addr() {
		return merc_base_addr;
	}

	public void setMerc_base_addr(String merc_base_addr) {
		this.merc_base_addr = merc_base_addr;
	}

	public String getMerc_deta_addr() {
		return merc_deta_addr;
	}

	public void setMerc_deta_addr(String merc_deta_addr) {
		this.merc_deta_addr = merc_deta_addr;
	}

	public String getMerc_repre_nm() {
		return merc_repre_nm;
	}

	public void setMerc_repre_nm(String merc_repre_nm) {
		this.merc_repre_nm = merc_repre_nm;
	}

	public String getTax_type_cd() {
		return tax_type_cd;
	}

	public void setTax_type_cd(String tax_type_cd) {
		this.tax_type_cd = tax_type_cd;
	}

	public String getClos_whet() {
		return clos_whet;
	}

	public void setClos_whet(String clos_whet) {
		this.clos_whet = clos_whet;
	}

	public String getClos_dd() {
		return clos_dd;
	}

	public void setClos_dd(String clos_dd) {
		this.clos_dd = clos_dd;
	}

}
