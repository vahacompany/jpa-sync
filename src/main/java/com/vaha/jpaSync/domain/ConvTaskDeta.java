package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 협약과제상세정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_TASK_DETA")
public class ConvTaskDeta extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DETA_ID")
	@JsonProperty
	private long id; // 협약과제상세T_아이디

	@OneToOne
	@JoinColumn(name = "TASK_ID")
	private ConvTask convTask; // 협약기관과제 TABLE

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String bimokGrouBizNm; // 비목_구분_사업_명

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String bizClasCd; // 사업_분류_코드

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String techFielCd; // 기술_분야_코드

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String totaRechStDd; // 총_연구_시작_일자

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String totaRechEdDd; // 총_연구_종료_일자

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String currRechStDd; // 당해_연구_시작_일자

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String currRechEdDd; // 당해_연구_종료_일자

	@Column(nullable = false)
	@JsonProperty
	private long currRechDevpAmt; // 당해_연구_개발비

	@Column(nullable = false)
	@JsonProperty
	private long currGovAmt; // 당해_정부_출연금

	@Column(nullable = false)
	@JsonProperty
	private long currGovNonAmt; // 당해_정부_외_출연금

	@Column(nullable = false)
	@JsonProperty
	private long currCorpCash; // 당해_기업_부담금_현금

	@Column(nullable = false)
	@JsonProperty
	private long currCorpStuf; // 당해_기업_부담금_현물

	@Column(nullable = false)
	@JsonProperty
	private long otheCounCash; // 상대_국가_부담금

	@Column(nullable = false)
	@JsonProperty
	private int carrCash; // 이월_현금

	@Column(nullable = false)
	@JsonProperty
	private int carrStuf; // 이월_현물

	@Column(nullable = false)
	@JsonProperty
	private int inteCash; // 이자_현금

	@Column(nullable = false)
	@JsonProperty
	private int inteStuf; // 이자_현물

	@Column(nullable = true, length = 3)
	@JsonProperty
	private String reseRequBkCd; // 연구비_청구_은행_코드

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String reseRequAccNum; // 연구비_청구_계좌_번호

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String reseRequAccHold; // 연구비_청구_계좌_예금주

	@Column(nullable = true, length = 3)
	@JsonProperty
	private String reseCardBkCd; // 연구비_카드_은행_코드

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String reseCardPaymAccNum; // 연구비_카드_결제_계좌_번호

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String reseCardPaymAccHold; // 연구비_카드_결제_계좌_예금주

	@Column(nullable = true, length = 10)
	@JsonProperty
	private String rechInstBizRegiNum; // 연구_수행기관_사업자_등록번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String rechInstGrouCd; // 연구_수행기관_구분_코드

	@Column(nullable = true, length = 50)
	@JsonProperty
	private String rechInstCorpEngNm; // 연구_수행기관_법인_영문_명

	@Builder
	public ConvTaskDeta(ConvTask convTask, String convInstCd, String convTaskNum, String bimokGrouBizNm,
			String bizClasCd, String techFielCd, String totaRechStDd, String totaRechEdDd, String currRechStDd,
			String currRechEdDd, long currRechDevpAmt, long currGovAmt, long currGovNonAmt, long currCorpCash,
			long currCorpStuf, long otheCounCash, int carrCash, int carrStuf, int inteCash, int inteStuf,
			String reseRequBkCd, String reseRequAccNum, String reseRequAccHold, String reseCardBkCd,
			String reseCardPaymAccNum, String reseCardPaymAccHold, String rechInstBizRegiNum, String rechInstGrouCd,
			String rechInstCorpEngNm) {
		this.convTask = convTask;
		this.convInstCd = convInstCd;
		this.convTaskNum = convTaskNum;
		this.bimokGrouBizNm = bimokGrouBizNm;
		this.bizClasCd = bizClasCd;
		this.techFielCd = techFielCd;
		this.totaRechStDd = totaRechStDd;
		this.totaRechEdDd = totaRechEdDd;
		this.currRechStDd = currRechStDd;
		this.currRechEdDd = currRechEdDd;
		this.currRechDevpAmt = currRechDevpAmt;
		this.currGovAmt = currGovAmt;
		this.currGovNonAmt = currGovNonAmt;
		this.currCorpCash = currCorpCash;
		this.currCorpStuf = currCorpStuf;
		this.otheCounCash = otheCounCash;
		this.carrCash = carrCash;
		this.carrStuf = carrStuf;
		this.inteCash = inteCash;
		this.inteStuf = inteStuf;
		this.reseRequBkCd = reseRequBkCd;
		this.reseRequAccNum = reseRequAccNum;
		this.reseRequAccHold = reseRequAccHold;
		this.reseCardBkCd = reseCardBkCd;
		this.reseCardPaymAccNum = reseCardPaymAccNum;
		this.reseCardPaymAccHold = reseCardPaymAccHold;
		this.rechInstBizRegiNum = rechInstBizRegiNum;
		this.rechInstGrouCd = rechInstGrouCd;
		this.rechInstCorpEngNm = rechInstCorpEngNm;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 등록_일자
		this.setChanTm(); // 등록_시간
	}
}
