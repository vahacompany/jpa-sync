package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 카드발급정보 */
@Entity
@Table(name="TB_CARD_ISSU")
@AttributeOverride(name="id", column=@Column(name="CAIS_ID"))
public class CardIssu extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id;           // 카드발급T
	
	@Column(nullable=false, length=16)	@JsonProperty
	private String cardNum;          // 카드_번호
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String cardCorpDivi;    // 카드_사_구분
	
	@Column(nullable=false, length=6)	@JsonProperty
	private String cardTypeCd;      // 카드_종류_코드
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String holdPrsn;        // 소지_자
	
	@Column(nullable=false, length=8)	@JsonProperty
	private String birt;              // 생년월일
	
	@Column(nullable=false, length=3)	@JsonProperty
	private String widrBkCd;        // 출금_은행_코드
	
	@Column(nullable=false, length=30)	@JsonProperty
	private String widrAccNum;      // 출금_계좌_번호
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String corpCustNum;     // 법인_고객_번호
	
	@Column(nullable=false, length=10)	@JsonProperty
	private String corpBizCustNum; // 법인_사업자_고객_번호
	
	@Column(nullable=false, length=8)	@JsonProperty
	private String cardIssuDd;      // 카드_발급_일자
	
	@Column(nullable=false, length=8)	@JsonProperty
	private String blDd;             // 거래정지_일자
	
	@Column(nullable=false, length=4)	@JsonProperty
	private String taskConvYy;      // 과제_협약_년도
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String myyCardWhet;     // 다년도_카드_여부
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String mobi;              // 휴대폰
	
	@Column(nullable=false, length=20)	@JsonProperty
	private String email;             // 이메일 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardCorpDivi() {
		return cardCorpDivi;
	}

	public void setCardCorpDivi(String cardCorpDivi) {
		this.cardCorpDivi = cardCorpDivi;
	}

	public String getCardTypeCd() {
		return cardTypeCd;
	}

	public void setCardTypeCd(String cardTypeCd) {
		this.cardTypeCd = cardTypeCd;
	}

	public String getHoldPrsn() {
		return holdPrsn;
	}

	public void setHoldPrsn(String holdPrsn) {
		this.holdPrsn = holdPrsn;
	}

	public String getBirt() {
		return birt;
	}

	public void setBirt(String birt) {
		this.birt = birt;
	}

	public String getWidrBkCd() {
		return widrBkCd;
	}

	public void setWidrBkCd(String widrBkCd) {
		this.widrBkCd = widrBkCd;
	}

	public String getWidrAccNum() {
		return widrAccNum;
	}

	public void setWidrAccNum(String widrAccNum) {
		this.widrAccNum = widrAccNum;
	}

	public String getCorpCustNum() {
		return corpCustNum;
	}

	public void setCorpCustNum(String corpCustNum) {
		this.corpCustNum = corpCustNum;
	}

	public String getCorpBizCustNum() {
		return corpBizCustNum;
	}

	public void setCorpBizCustNum(String corpBizCustNum) {
		this.corpBizCustNum = corpBizCustNum;
	}

	public String getCardIssuDd() {
		return cardIssuDd;
	}

	public void setCardIssuDd(String cardIssuDd) {
		this.cardIssuDd = cardIssuDd;
	}

	public String getBlDd() {
		return blDd;
	}

	public void setBlDd(String blDd) {
		this.blDd = blDd;
	}

	public String getTaskConvYy() {
		return taskConvYy;
	}

	public void setTaskConvYy(String taskConvYy) {
		this.taskConvYy = taskConvYy;
	}

	public String getMyyCardWhet() {
		return myyCardWhet;
	}

	public void setMyyCardWhet(String myyCardWhet) {
		this.myyCardWhet = myyCardWhet;
	}

	public String getMobi() {
		return mobi;
	}

	public void setMobi(String mobi) {
		this.mobi = mobi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
