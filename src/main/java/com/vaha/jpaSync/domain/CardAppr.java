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

/* 카드승인정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CARD_APPR")
public class CardAppr extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	@Column(name = "APPR_ID")
	private long id; // 카드승인T

	@Column(nullable = false)
	@JsonProperty
	private CardIssu cardIssu; // 카드발급T

	@Column(nullable = false)
	@JsonProperty
	private Merc merc; // 가맹점T

	@Column(nullable = false, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String apprNum; // 승인_번호

	@Column(nullable = false, length = 14)
	@JsonProperty
	private String apprDt; // 승인_일시

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String cancDd; // 취소_일자

	@Column(nullable = false)
	@JsonProperty
	private long apprOver; // 승인_금액

	@Column(nullable = false)
	@JsonProperty
	private double vat; // 부가세

	@Column(nullable = false)
	@JsonProperty
	private double servChag; // 봉사료

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String ovseUseWhet; // 해외_사용_여부

	@Column(nullable = false)
	@JsonProperty
	private double applExch; // 적용_환율

	@Column(nullable = false)
	@JsonProperty
	private double tradDollOver; // 거래_달러_금액

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String curyCd; // 통화_코드

	@Builder
	public CardAppr(CardIssu cardIssu, Merc merc, String cardNum, String apprNum, String apprDt, long apprOver,
			double vat, double servChag, String ovseUseWhet, double applExch, double tradDollOver) {
		this.cardIssu = cardIssu;
		this.merc = merc;
		this.cardNum = cardNum;
		this.apprNum = apprNum;
		this.apprDt = apprDt;
		this.apprOver = apprOver;
		this.vat = vat;
		this.servChag = servChag;
		this.ovseUseWhet = ovseUseWhet;
		this.applExch = applExch;
		this.tradDollOver = tradDollOver;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
