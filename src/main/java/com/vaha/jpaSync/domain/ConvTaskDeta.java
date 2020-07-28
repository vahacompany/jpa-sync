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
	
	@Column(nullable = false)
	@JsonProperty
	private long taskId;

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
	private String reseInstBizRegiNum; // 연구_수행기관_사업자_등록번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String reseInstTypeCd; // 연구_수행기관_구분_코드

	@Column(nullable = true, length = 50)
	@JsonProperty
	private String reseInstCorpEngNm; // 연구_수행기관_법인_영문_명

	@Builder
	public ConvTaskDeta(String pConvInstCd, String pConvTaskNum, String pBimokGrouBizNm,
			String pBizClasCd, String pTechFielCd, String pTotaRechStDd, String pTotaRechEdDd, long pCurrRechDevpAmt,
			long pCurrGovAmt, long pCurrGovNonAmt, long pCurrCorpCash, long pCurrCorpStuf, long pOtheCounCash,
			int pCarrCash, int pCarrStuf, int pInteCash, int pInteStuf, String pReseRequBkCd, String pReseRequAccNum,
			String pReseRequAccHold, String pReseCardBkCd, String pReseCardPaymAccNum, String pReseCardPaymAccHold,
			String pReseInstBizRegiNum, String pReseInstTypeCd, String pReseInstCorpEngNm) {
		this.convInstCd = pConvInstCd;
		this.convTaskNum = pConvTaskNum;
		this.bimokGrouBizNm = pBimokGrouBizNm;
		this.bizClasCd = pBizClasCd;
		this.techFielCd = pTechFielCd;
		this.totaRechStDd = pTotaRechStDd;
		this.totaRechEdDd = pTotaRechEdDd;
		this.currRechDevpAmt = pCurrRechDevpAmt;
		this.currGovAmt = pCurrGovAmt;
		this.currGovNonAmt = pCurrGovNonAmt;
		this.currCorpCash = pCurrCorpCash;
		this.currCorpStuf = pCurrCorpStuf;
		this.otheCounCash = pOtheCounCash;
		this.carrCash = pCarrCash;
		this.carrStuf = pCarrStuf;
		this.inteCash = pInteCash;
		this.inteStuf = pInteStuf;
		this.reseRequBkCd = pReseRequBkCd;
		this.reseRequAccNum = pReseRequAccNum;
		this.reseRequAccHold = pReseRequAccHold;
		this.reseCardBkCd = pReseCardBkCd;
		this.reseCardPaymAccNum = pReseCardPaymAccNum;
		this.reseCardPaymAccHold = pReseCardPaymAccHold;
		this.reseInstBizRegiNum = pReseInstBizRegiNum;
		this.reseInstTypeCd = pReseInstTypeCd;
		this.reseInstCorpEngNm = pReseInstCorpEngNm;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 등록_일자
		this.setChanTm(); // 등록_시간
	}
}
