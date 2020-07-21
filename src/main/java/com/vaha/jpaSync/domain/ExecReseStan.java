package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 과제집행연구원기준정보 */
@Entity
@Table(name="TB_EXEC_RESE_STAN")
public class ExecReseStan extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue	@JsonProperty
	private long id;                // 테이블ID
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String conv_inst_cd;    // 협약_기관_코드
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String conv_task_num;   // 협약_과제_번호
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String rese_regi_num;   // 연구자_등록번호
	
	@Column(nullable=false)	@JsonProperty
	private int regi_orde;          // 등록_차수
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String rese_divi;       // 연구자_구분    
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String lega_birt;       // 법정_생년월일    
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String rese_gend;       // 연구자_성별    
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String rese_role_divi;  // 연구자_역할_구분    
	
	@Column(nullable=true, length=100)	@JsonProperty
	private String belo;            // 소속    
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String nm;              // 성명    
	
	@Column(nullable=true, length=40)	@JsonProperty
	private String rank;            // 직급    
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String part_st_dd;      // 참여_시작_일자    
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String part_ed;         // 참여_종료_일자    
	
	@Column(nullable=true, length=50)	@JsonProperty
	private String email;           // 이메일    
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String mobi;            // 휴대폰    
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String tel;             // 전화번호    
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String tran_whet;       // 송신_여부  
	
	@Column(nullable=true, length=1)	@JsonProperty
	private String tran_opt;        // 송신_옵션    
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String tran_dd;         // 송신_일자    
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String tran_tm;         // 송신_시간    
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String tran_stat_cd;    // 송신_상태_코드

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConv_inst_cd() {
		return conv_inst_cd;
	}

	public void setConv_inst_cd(String conv_inst_cd) {
		this.conv_inst_cd = conv_inst_cd;
	}

	public String getConv_task_num() {
		return conv_task_num;
	}

	public void setConv_task_num(String conv_task_num) {
		this.conv_task_num = conv_task_num;
	}

	public String getRese_regi_num() {
		return rese_regi_num;
	}

	public void setRese_regi_num(String rese_regi_num) {
		this.rese_regi_num = rese_regi_num;
	}

	public int getRegi_orde() {
		return regi_orde;
	}

	public void setRegi_orde(int regi_orde) {
		this.regi_orde = regi_orde;
	}

	public String getRese_divi() {
		return rese_divi;
	}

	public void setRese_divi(String rese_divi) {
		this.rese_divi = rese_divi;
	}

	public String getLega_birt() {
		return lega_birt;
	}

	public void setLega_birt(String lega_birt) {
		this.lega_birt = lega_birt;
	}

	public String getRese_gend() {
		return rese_gend;
	}

	public void setRese_gend(String rese_gend) {
		this.rese_gend = rese_gend;
	}

	public String getRese_role_divi() {
		return rese_role_divi;
	}

	public void setRese_role_divi(String rese_role_divi) {
		this.rese_role_divi = rese_role_divi;
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

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPart_st_dd() {
		return part_st_dd;
	}

	public void setPart_st_dd(String part_st_dd) {
		this.part_st_dd = part_st_dd;
	}

	public String getPart_ed() {
		return part_ed;
	}

	public void setPart_ed(String part_ed) {
		this.part_ed = part_ed;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTran_whet() {
		return tran_whet;
	}

	public void setTran_whet(String tran_whet) {
		this.tran_whet = tran_whet;
	}

	public String getTran_opt() {
		return tran_opt;
	}

	public void setTran_opt(String tran_opt) {
		this.tran_opt = tran_opt;
	}

	public String getTran_dd() {
		return tran_dd;
	}

	public void setTran_dd(String tran_dd) {
		this.tran_dd = tran_dd;
	}

	public String getTran_tm() {
		return tran_tm;
	}

	public void setTran_tm(String tran_tm) {
		this.tran_tm = tran_tm;
	}

	public String getTran_stat_cd() {
		return tran_stat_cd;
	}

	public void setTran_stat_cd(String tran_stat_cd) {
		this.tran_stat_cd = tran_stat_cd;
	}
	
	
}
