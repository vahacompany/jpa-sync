package com.vaha.jpaSync.domain;

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

/* 과제집행연구원기준정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_RESE_STAN")
public class ExecReseStan extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEMB_ID")
	@JsonProperty
	private long id; // 테이블ID

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록번호

	@Column(nullable = false)
	@JsonProperty
	private int regiOrde; // 등록_차수

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String reseDivi; // 연구자_구분

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String legaBirt; // 법정_생년월일

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String reseGend; // 연구자_성별

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String reseRoleDivi; // 연구자_역할_구분

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String belo; // 소속

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String nm; // 성명

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String rank; // 직급

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String partStDd; // 참여_시작_일자

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String partEd; // 참여_종료_일자

	@Column(nullable = true, length = 50)
	@JsonProperty
	private String email; // 이메일

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String mobi; // 휴대폰

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String tel; // 전화번호

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String tranWhet; // 송신_여부

	@Column(nullable = true, length = 1)
	@JsonProperty
	private String tranOpt; // 송신_옵션

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String tranDd; // 송신_일자

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String tranTm; // 송신_시간

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String tranStatCd; // 송신_상태_코드

	@Builder
	public ExecReseStan(String convInstCd, String convTaskNum, String reseRegiNum, int regiOrde, String tranWhet) {
		this.convInstCd = convInstCd;
		this.convTaskNum = convTaskNum;
		this.reseRegiNum = reseRegiNum;
		this.regiOrde = regiOrde;
		this.tranWhet = tranWhet;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
