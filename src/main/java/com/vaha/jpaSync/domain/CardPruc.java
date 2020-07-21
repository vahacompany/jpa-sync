package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 카드매입정보 */
@Entity
@Table(name="TB_CARD_PRUC")
@AttributeOverride(name="id", column=@Column(name="PRUC_ID"))
public class CardPruc extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private String id;             // 카드매입T
	
	@Column(nullable=false)	@JsonProperty
	private CardIssu convIssu;             // 카드발급T
	
	@Column(nullable=false)	@JsonProperty
	private Merc merc;             // 가맹점T
	
	@Column(nullable=true, length=16)	@JsonProperty
	private String cardNum;            // 카드_번호
	
	@Column(nullable=true, length=20)	@JsonProperty
	private String requSeri;           // 청구_일련_번호
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String tradDd;             // 거래_일자
	
	@Column(nullable=true, length=10)	@JsonProperty
	private String mercNum;            // 가맹점_번호 
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String tradTm;             // 거래_시간
	
	@Column(nullable=true, length=30)	@JsonProperty
	private String apprNum;            // 승인_번호
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String paymDd;             // 결제_일자
	
	@Column(nullable=false)	@JsonProperty
	private String useOver;            // 사용_금액
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String receDd;             // 접수_일자
	
	@Column(nullable=true, length=30)	@JsonProperty
	private String docuNum;            // 전표_번호
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String counCd;             // 국가_코드
	
	@Column(nullable=false)	@JsonProperty
	private String apprOver;           // 승인_금액
	
	@Column(nullable=false)	@JsonProperty
	private String purcOver;           // 매입_금액
	
	@Column(nullable=false)	@JsonProperty
	private String applExch;           // 적용_환율
	
	@Column(nullable=false)	@JsonProperty
	private String dollPurcTot;       // 달러_매입_합계
	
	@Column(nullable=false)	@JsonProperty
	private String ovseFee;            // 해외_수수료
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String ovseUseWhet;       // 해외_사용_여부
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String partPurcCancWhet; // 부분_매입_취소_여부
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String confDd;             // 확정_일자
	
	@Column(nullable=false)	@JsonProperty
	private String vat;                 // 부가세
	
	@Column(nullable=true, length=6)	@JsonProperty
	private String taxTypeCd;         // 과세_유형_코드
	
	@Column(nullable=false, length=1)	@JsonProperty
	private String closWhet;           // 폐업_여부
	
	@Column(nullable=true, length=8)	@JsonProperty
	private String closDd;             // 폐업_일자

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CardIssu getConvIssu() {
		return convIssu;
	}

	public void setConvIssu(CardIssu convIssu) {
		this.convIssu = convIssu;
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

	public String getRequSeri() {
		return requSeri;
	}

	public void setRequSeri(String requSeri) {
		this.requSeri = requSeri;
	}

	public String getTradDd() {
		return tradDd;
	}

	public void setTradDd(String tradDd) {
		this.tradDd = tradDd;
	}

	public String getMercNum() {
		return mercNum;
	}

	public void setMercNum(String mercNum) {
		this.mercNum = mercNum;
	}

	public String getTradTm() {
		return tradTm;
	}

	public void setTradTm(String tradTm) {
		this.tradTm = tradTm;
	}

	public String getApprNum() {
		return apprNum;
	}

	public void setApprNum(String apprNum) {
		this.apprNum = apprNum;
	}

	public String getPaymDd() {
		return paymDd;
	}

	public void setPaymDd(String paymDd) {
		this.paymDd = paymDd;
	}

	public String getUseOver() {
		return useOver;
	}

	public void setUseOver(String useOver) {
		this.useOver = useOver;
	}

	public String getReceDd() {
		return receDd;
	}

	public void setReceDd(String receDd) {
		this.receDd = receDd;
	}

	public String getDocuNum() {
		return docuNum;
	}

	public void setDocuNum(String docuNum) {
		this.docuNum = docuNum;
	}

	public String getCounCd() {
		return counCd;
	}

	public void setCounCd(String counCd) {
		this.counCd = counCd;
	}

	public String getApprOver() {
		return apprOver;
	}

	public void setApprOver(String apprOver) {
		this.apprOver = apprOver;
	}

	public String getPurcOver() {
		return purcOver;
	}

	public void setPurcOver(String purcOver) {
		this.purcOver = purcOver;
	}

	public String getApplExch() {
		return applExch;
	}

	public void setApplExch(String applExch) {
		this.applExch = applExch;
	}

	public String getDollPurcTot() {
		return dollPurcTot;
	}

	public void setDollPurcTot(String dollPurcTot) {
		this.dollPurcTot = dollPurcTot;
	}

	public String getOvseFee() {
		return ovseFee;
	}

	public void setOvseFee(String ovseFee) {
		this.ovseFee = ovseFee;
	}

	public String getOvseUseWhet() {
		return ovseUseWhet;
	}

	public void setOvseUseWhet(String ovseUseWhet) {
		this.ovseUseWhet = ovseUseWhet;
	}

	public String getPartPurcCancWhet() {
		return partPurcCancWhet;
	}

	public void setPartPurcCancWhet(String partPurcCancWhet) {
		this.partPurcCancWhet = partPurcCancWhet;
	}

	public String getConfDd() {
		return confDd;
	}

	public void setConfDd(String confDd) {
		this.confDd = confDd;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getTaxTypeCd() {
		return taxTypeCd;
	}

	public void setTaxTypeCd(String taxTypeCd) {
		this.taxTypeCd = taxTypeCd;
	}

	public String getClosWhet() {
		return closWhet;
	}

	public void setClosWhet(String closWhet) {
		this.closWhet = closWhet;
	}

	public String getClosDd() {
		return closDd;
	}

	public void setClosDd(String closDd) {
		this.closDd = closDd;
	}

}
