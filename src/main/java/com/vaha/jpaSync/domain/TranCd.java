package com.vaha.jpaSync.domain;

import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 전송코드정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_TRAN_CD")
public class TranCd extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRAN_ID")
	@JsonProperty
	private long id; // 전송T_아이디 INT UNSIGNED NOT NULL,

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String tranCd; // 전송_코드

	@Column(nullable = true)
	@JsonProperty
	private Clob tranHist; // 전송_내역

	@Column(nullable = true)
	@JsonProperty
	private Clob procMeth; // 처리_방법

	@Column(nullable = true, length = 255)
	@JsonProperty
	private String rema; // 비고

	@Builder
	public TranCd(String tranCd) {
		this.tranCd = tranCd;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
