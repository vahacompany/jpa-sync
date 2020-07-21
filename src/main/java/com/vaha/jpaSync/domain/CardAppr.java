package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 카드승인정보 */
@Entity
@Table(name="TB_CARD_APPR")
@AttributeOverride(name="id", column=@Column(name="APPR_ID"))
public class CardAppr extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@JsonProperty
	private String id;        // 카드승인T
	
	@Column(nullable=false)	@JsonProperty
	private CardIssu cardIssu;        // 카드발급T
	
	@Column(nullable=false)	@JsonProperty
	private Merc merc;        // 가맹점T
	
	@Column(nullable=false, length=16)	@JsonProperty
	private String cardNum;       // 카드_번호
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String apprNum;       // 승인_번호
	
	@Column(nullable=false, length=14)	@JsonProperty
	private String apprDt;        // 승인_일시
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String cancDd;        // 취소_일자
	
	@Column(nullable=false)	@JsonProperty
	private String apprOver;      // 승인_금액
	
	@Column(nullable=false)	@JsonProperty
	private String vat;            // 부가세
	
	@Column(nullable=false)	@JsonProperty
	private String servChag;      // 봉사료
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String ovseUseWhet;  // 해외_사용_여부
	
	@Column(nullable=false)	@JsonProperty
	private String applExch;      // 적용_환율
	
	@Column(nullable=false)	@JsonProperty
	private String tradDollOver; // 거래_달러_금액
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String curyCd;        // 통화_코드

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CardIssu getCardIssu() {
		return cardIssu;
	}

	public void setCardIssu(CardIssu cardIssu) {
		this.cardIssu = cardIssu;
	}

	public Merc getMerc() {
		return merc;
	}

	public void setMerc(Merc merc) {
		this.merc = merc;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getApprNum() {
		return apprNum;
	}

	public void setApprNum(String apprNum) {
		this.apprNum = apprNum;
	}

	public String getApprDt() {
		return apprDt;
	}

	public void setApprDt(String apprDt) {
		this.apprDt = apprDt;
	}

	public String getCancDd() {
		return cancDd;
	}

	public void setCancDd(String cancDd) {
		this.cancDd = cancDd;
	}

	public String getApprOver() {
		return apprOver;
	}

	public void setApprOver(String apprOver) {
		this.apprOver = apprOver;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getServChag() {
		return servChag;
	}

	public void setServChag(String servChag) {
		this.servChag = servChag;
	}

	public String getOvseUseWhet() {
		return ovseUseWhet;
	}

	public void setOvseUseWhet(String ovseUseWhet) {
		this.ovseUseWhet = ovseUseWhet;
	}

	public String getApplExch() {
		return applExch;
	}

	public void setApplExch(String applExch) {
		this.applExch = applExch;
	}

	public String getTradDollOver() {
		return tradDollOver;
	}

	public void setTradDollOver(String tradDollOver) {
		this.tradDollOver = tradDollOver;
	}

	public String getCuryCd() {
		return curyCd;
	}

	public void setCuryCd(String curyCd) {
		this.curyCd = curyCd;
	}

}
