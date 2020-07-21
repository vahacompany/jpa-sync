package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 카드연체정보 */
@Entity
@Table(name="TB_CARD_OVDUE")
@AttributeOverride(name="id", column=@Column(name="OVDUE_ID"))
public class CardOvdue extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id; // 카드연체T
	
	@Column(nullable=false)	@JsonProperty
	private CardIssu cardIssu;  // 카드발급T
	
	@Column(nullable=true, length=16)	@JsonProperty
	private String cardNum; // 카드_번호

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CardIssu getCardIssu() {
		return cardIssu;
	}

	public void setCardIssu(CardIssu cardIssu) {
		this.cardIssu = cardIssu;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

}
