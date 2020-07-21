package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 과제집행연구원월별참여정보 */
@Entity
@Table(name="TB_EXEC_YM_PART")
@AttributeOverride(name = "id", column = @Column(name = "MEMB_ID"))
public class ExecYmPart extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue	@JsonProperty
	private long id;       // 과제집행연구원월별참여T_아이디 

	@Column(nullable = false)	@JsonProperty
	//@ManyToOne @JoinColumn(name = "MEMB_ID")
	private ExecReseStan execReseStan;       // 협약과제연구원 

	@Column(nullable = false, length = 10)	@JsonProperty
	private String conv_inst_cd;  // 협약_기관_코드

	@Column(nullable = false, length = 30)	@JsonProperty
	private String conv_task_num; // 협약_과제_번호

	@Column(nullable = false, length = 10)	@JsonProperty
	private String rese_regi_num; // 연구자_등록_번호

	@Column(nullable = false)	@JsonProperty
	private int regi_orde;     // 등록_차수

	@Column(nullable = false, length = 6)	@JsonProperty
	private String part_ym;       // 참여_년월

	@Column(nullable = false)	@JsonProperty
	private int paym_stan_amt; // 지급_기준_금액 

	@Column(nullable = false)	@JsonProperty
	private float part_rate;     // 참여_률

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ExecReseStan getExecReseStan() {
		return execReseStan;
	}

	public void setExecReseStan(ExecReseStan execReseStan) {
		this.execReseStan = execReseStan;
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

	public String getPart_ym() {
		return part_ym;
	}

	public void setPart_ym(String part_ym) {
		this.part_ym = part_ym;
	}

	public int getPaym_stan_amt() {
		return paym_stan_amt;
	}

	public void setPaym_stan_amt(int paym_stan_amt) {
		this.paym_stan_amt = paym_stan_amt;
	}

	public float getPart_rate() {
		return part_rate;
	}

	public void setPart_rate(float part_rate) {
		this.part_rate = part_rate;
	}

}
