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

/* 카드연체정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CARD_OVDUE")
public class CardOvdue extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OVDUE_ID")
	@JsonProperty
	private long id; // 카드연체T

	@Column(nullable = false)
	@JsonProperty
	private CardIssu cardIssu; // 카드발급T

	@Column(nullable = true, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Builder
	public CardOvdue(CardIssu cardIssu, String cardNum) {
		this.cardIssu = cardIssu;
		this.cardNum = cardNum;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
