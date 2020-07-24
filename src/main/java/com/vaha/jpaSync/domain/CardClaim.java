package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

/* 카드청구정보 */
@Entity
@Table(name = "TB_CARD_CLAIM")
public class CardClaim extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "CLAIM_ID")
	@JsonProperty
	private long id; // 카드청구T

	@Column(nullable = false)
	@JsonProperty
	private CardIssu cardIssu; // 카드발급T

	@Column(nullable = true, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Builder
	public CardClaim(CardIssu cardIssu, String cardNum) {
		this.cardIssu = cardIssu;
		this.cardNum = cardNum;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
