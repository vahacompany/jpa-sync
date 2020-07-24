package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 카드발급정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CARD_ISSU")
public class CardIssu extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "CAIS_ID")
	@JsonProperty
	private long id; // 카드발급T

	@Column(nullable = false, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String cardCorpDivi; // 카드_사_구분

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String cardTypeCd; // 카드_종류_코드

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String holdPrsn; // 소지_자

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String birt; // 생년월일

	@Column(nullable = true, length = 3)
	@JsonProperty
	private String widrBkCd; // 출금_은행_코드

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String widrAccNum; // 출금_계좌_번호

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String corpCustNum; // 법인_고객_번호

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String corpBizCustNum; // 법인_사업자_고객_번호

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String cardIssuDd; // 카드_발급_일자

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String blDd; // 거래정지_일자

	@Column(nullable = false, length = 4)
	@JsonProperty
	private String taskConvYy; // 과제_협약_년도

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String myyCardWhet; // 다년도_카드_여부

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String mobi; // 휴대폰

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String email; // 이메일

	@Builder
	public CardIssu(String cardNum, String corpCustNum, String corpBizCustNum, String cardIssuDd, String blDd,
			String taskConvYy, String myyCardWhet) {
		this.cardNum = cardNum;
		this.corpCustNum = corpCustNum;
		this.corpBizCustNum = corpBizCustNum;
		this.cardIssuDd = cardIssuDd;
		this.blDd = blDd;
		this.taskConvYy = taskConvYy;
		this.myyCardWhet = myyCardWhet;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
