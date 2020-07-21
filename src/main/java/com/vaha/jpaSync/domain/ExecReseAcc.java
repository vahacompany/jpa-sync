package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 과제집행연구원계좌정보 */
@Entity
@Table(name = "TB_EXEC_RESE_ACC")
public class ExecReseAcc extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue	@JsonProperty
	private long id; // 테이블ID

	@Column(nullable = false)	@JsonProperty
	//@ManyToOne @JoinColumn(name = "MEMB_ID")
	private ExecReseStan execReseStan; // 협약과제연구원T_아이디

	@Column(nullable = false, length = 10)	@JsonProperty
	private String reseRegiNum; // 연구자_등록번호

	@Column(nullable = true, length = 30)	@JsonProperty
	private String accNum; // 계좌_번호

	@Column(nullable = true, length = 3)	@JsonProperty
	private String accBk; // 계좌_은행

	@Column(nullable = false, length = 1)	@JsonProperty
	private String certWhet; // 인증_여부

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

	public String getReseRegiNum() {
		return reseRegiNum;
	}

	public void setReseRegiNum(String reseRegiNum) {
		this.reseRegiNum = reseRegiNum;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getAccBk() {
		return accBk;
	}

	public void setAccBk(String accBk) {
		this.accBk = accBk;
	}

	public String getCertWhet() {
		return certWhet;
	}

	public void setCertWhet(String certWhet) {
		this.certWhet = certWhet;
	}

}
