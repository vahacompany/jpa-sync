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

/* 카드매입정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CARD_PRUC")
public class CardPruc extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRUC_ID")
	@JsonProperty
	private String id; // 카드매입T

	@Column(nullable = false)
	@JsonProperty
	private CardIssu convIssu; // 카드발급T

	@Column(nullable = false)
	@JsonProperty
	private Merc merc; // 가맹점T

	@Column(nullable = true, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String requSeri; // 청구_일련_번호

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String tradDd; // 거래_일자

	@Column(nullable = true, length = 10)
	@JsonProperty
	private String mercNum; // 가맹점_번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String tradTm; // 거래_시간

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String apprNum; // 승인_번호

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String paymDd; // 결제_일자

	@Column(nullable = false)
	@JsonProperty
	private long useOver; // 사용_금액

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String receDd; // 접수_일자

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String docuNum; // 전표_번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String counCd; // 국가_코드

	@Column(nullable = false)
	@JsonProperty
	private long apprOver; // 승인_금액

	@Column(nullable = false)
	@JsonProperty
	private long purcOver; // 매입_금액

	@Column(nullable = false)
	@JsonProperty
	private float applExch; // 적용_환율

	@Column(nullable = false)
	@JsonProperty
	private double dollPurcTot; // 달러_매입_합계

	@Column(nullable = false)
	@JsonProperty
	private double ovseFee; // 해외_수수료

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String ovseUseWhet; // 해외_사용_여부

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String partPurcCancWhet; // 부분_매입_취소_여부

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String confDd; // 확정_일자

	@Column(nullable = false)
	@JsonProperty
	private double vat; // 부가세

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String taxTypeCd; // 과세_유형_코드

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String closWhet; // 폐업_여부

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String closDd; // 폐업_일자

	@Builder
	public CardPruc(CardIssu convIssu, Merc merc, long useOver, long apprOver, long purcOver, float applExch,
			long dollPurcTot, double ovseFee, String ovseUseWhet, String partPurcCancWhet, double vat,
			String closWhet) {
		this.convIssu = convIssu;
		this.merc = merc;
		this.useOver = useOver;
		this.apprOver = apprOver;
		this.purcOver = purcOver;
		this.applExch = applExch;
		this.dollPurcTot = dollPurcTot;
		this.ovseFee = ovseFee;
		this.ovseUseWhet = ovseUseWhet;
		this.partPurcCancWhet = partPurcCancWhet;
		this.vat = vat;
		this.closWhet = closWhet;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
