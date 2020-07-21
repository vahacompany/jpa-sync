package com.vaha.jpaSync.domain;

import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/* 과제집행요청정보 */
@Entity
@Table(name="TB_EXEC_REQU")
public class ExecRequ extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long requId;           // 과제집행요청T_아이디 

	@Column(nullable = false, length=10)	@JsonProperty
	private String convInstCd;      // 협약_기관_코드 

	@Column(nullable = false, length=30)	@JsonProperty
	private String convTaskNum;     // 협약_과제_번호

	@Column(nullable = false, length=8)	@JsonProperty
	private String execRequDd;      // 집행_요청_일자

	@Column(nullable = false, length=20)	@JsonProperty
	private String regiSeri;         // 등록_일련_번호

	@Column(nullable = false, length=6)	@JsonProperty
	private String execRequTm;      // 집행_요청_시간

	@Column(nullable = false)	@JsonProperty
	private int execRequOrde;    // 집행_요청_순번

	@Column(nullable = true, length=10)	@JsonProperty
	private String bimokCd;          // 비목_코드

	@Column(nullable = true, length=6)	@JsonProperty
	private String execRequDivi;    // 집행_요청_구분

	@Column(nullable = true, length=6)	@JsonProperty
	private String execDivi;         // 집행_구분

	@Column(nullable = true, length=6)	@JsonProperty
	private String execMeth;         // 집행_방법

	@Column(nullable = true, length=30)	@JsonProperty
	private String resoNum;          // 결의_번호

	@Column(nullable = true, length=8)	@JsonProperty
	private String resoDd;           // 결의_일자

	@Column(nullable = true)	@JsonProperty
	private Clob cont;              // 내용

	@Column(nullable = true, length=100)	@JsonProperty
	private String belo;              // 소속

	@Column(nullable = true, length=20)	@JsonProperty
	private String nm;                // 성명

	@Column(nullable = true, length=10)	@JsonProperty
	private String reseRegiNum;     // 연구자_등록_번호

	@Column(nullable = true, length=40)	@JsonProperty
	private String spot;              // 직위

	@Column(nullable = true)	@JsonProperty
	private float partRate;         // 참여_율

	@Column(nullable = true)	@JsonProperty
	private int paymStanAmt;     // 지급_기준_금액

	@Column(nullable = true)	@JsonProperty
	private int paymAmt;          // 지급_금액

	@Column(nullable = true, length=3)	@JsonProperty
	private String execRequBk;      // 집행_요청_은행

	@Column(nullable = true, length=30)	@JsonProperty
	private String execRequAccNum; // 집행_요청_계좌_번호

	@Column(nullable = true, length=40)	@JsonProperty
	private String requAccHold;     // 요청_계좌_예금주

	@Column(nullable = true, length=6)	@JsonProperty
	private String execRequStat;    // 집행_요청_상태

	@Column(nullable = true, length=30)	@JsonProperty
	private String etaxManaNum;     // 전자세금계산서_관리_번호

	@Column(nullable = true, length=6)	@JsonProperty
	private String kindDivi;         // 물품_구분

	@Column(nullable = true, length=14)	@JsonProperty
	private String meetDt;           // 회의_일시

	@Column(nullable = true, length=100)	@JsonProperty
	private String meetPlac;         // 회의_장소

	@Column(nullable = true, length=10)	@JsonProperty
	private String consInst;         // 위탁_기관

	@Column(nullable = true, length=10)	@JsonProperty
	private String bizRegiNum;      // 사업자_등록_번호

	@Column(nullable = true, length=1)	@JsonProperty
	private String sendWhet;         // 송신_여부

	@Column(nullable = true, length=6)	@JsonProperty
	private String sendOpt;          // 송신_옵션

	@Column(nullable = true, length=8)	@JsonProperty
	private String sendDd;           // 송신_일자

	@Column(nullable = true, length=6)	@JsonProperty
	private String sendTm;           // 송신_시간

	@Column(nullable = true, length=6)	@JsonProperty
	private String sendStatCd;      // 송신_상태_코드

	@Column(nullable = true, length=8)	@JsonProperty
	private String receDd;           // 수신_일자

	@Column(nullable = true, length=6)	@JsonProperty
	private String receTm;           // 수신_시간

	@Column(nullable = true, length=30)	@JsonProperty
	private String execConfNum;     // 집행_확인_번호

	@Column(nullable = true, length=8)	@JsonProperty
	private String tranDd;           // 이체_일자

	@Column(nullable = true, length=6)	@JsonProperty
	private String tranTm;           // 이체_시간

	@Column(nullable = true, length=3)	@JsonProperty
	private String tranBk;           // 이체_은행

	@Column(nullable = true, length=30)	@JsonProperty
	private String tranAccNum;      // 이체_계좌_번호

	@Column(nullable = true, length=100)	@JsonProperty
	private String reciPrsn;         // 수령_인

	@Column(nullable = true, length=1)	@JsonProperty
	private String cancWhet;         // 취소_여부

	@Column(nullable = true, length=16)	@JsonProperty
	private String cardNum;          // 카드_번호

	@Column(nullable = true, length=30)	@JsonProperty
	private String apprNum;          // 승인_번호

	@Column(nullable = true, length=20)	@JsonProperty
	private String requSeri;         // 청구_일련_번호
	
	@Column(nullable = true)	@JsonProperty
	private int tradInte;         // 거래_이자

	public long getRequId() {
		return requId;
	}

	public void setRequId(long requId) {
		this.requId = requId;
	}

	public String getConvInstCd() {
		return convInstCd;
	}

	public void setConvInstCd(String convInstCd) {
		this.convInstCd = convInstCd;
	}

	public String getConvTaskNum() {
		return convTaskNum;
	}

	public void setConvTaskNum(String convTaskNum) {
		this.convTaskNum = convTaskNum;
	}

	public String getExecRequDd() {
		return execRequDd;
	}

	public void setExecRequDd(String execRequDd) {
		this.execRequDd = execRequDd;
	}

	public String getRegiSeri() {
		return regiSeri;
	}

	public void setRegiSeri(String regiSeri) {
		this.regiSeri = regiSeri;
	}

	public String getExecRequTm() {
		return execRequTm;
	}

	public void setExecRequTm(String execRequTm) {
		this.execRequTm = execRequTm;
	}

	public int getExecRequOrde() {
		return execRequOrde;
	}

	public void setExecRequOrde(int execRequOrde) {
		this.execRequOrde = execRequOrde;
	}

	public String getBimokCd() {
		return bimokCd;
	}

	public void setBimokCd(String bimokCd) {
		this.bimokCd = bimokCd;
	}

	public String getExecRequDivi() {
		return execRequDivi;
	}

	public void setExecRequDivi(String execRequDivi) {
		this.execRequDivi = execRequDivi;
	}

	public String getExecDivi() {
		return execDivi;
	}

	public void setExecDivi(String execDivi) {
		this.execDivi = execDivi;
	}

	public String getExecMeth() {
		return execMeth;
	}

	public void setExecMeth(String execMeth) {
		this.execMeth = execMeth;
	}

	public String getResoNum() {
		return resoNum;
	}

	public void setResoNum(String resoNum) {
		this.resoNum = resoNum;
	}

	public String getResoDd() {
		return resoDd;
	}

	public void setResoDd(String resoDd) {
		this.resoDd = resoDd;
	}

	public Clob getCont() {
		return cont;
	}

	public void setCont(Clob cont) {
		this.cont = cont;
	}

	public String getBelo() {
		return belo;
	}

	public void setBelo(String belo) {
		this.belo = belo;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getReseRegiNum() {
		return reseRegiNum;
	}

	public void setReseRegiNum(String reseRegiNum) {
		this.reseRegiNum = reseRegiNum;
	}

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	public float getPartRate() {
		return partRate;
	}

	public void setPartRate(float partRate) {
		this.partRate = partRate;
	}

	public int getPaymStanAmt() {
		return paymStanAmt;
	}

	public void setPaymStanAmt(int paymStanAmt) {
		this.paymStanAmt = paymStanAmt;
	}

	public int getPaymAmt() {
		return paymAmt;
	}

	public void setPaymAmt(int paymAmt) {
		this.paymAmt = paymAmt;
	}

	public String getExecRequBk() {
		return execRequBk;
	}

	public void setExecRequBk(String execRequBk) {
		this.execRequBk = execRequBk;
	}

	public String getExecRequAccNum() {
		return execRequAccNum;
	}

	public void setExecRequAccNum(String execRequAccNum) {
		this.execRequAccNum = execRequAccNum;
	}

	public String getRequAccHold() {
		return requAccHold;
	}

	public void setRequAccHold(String requAccHold) {
		this.requAccHold = requAccHold;
	}

	public String getExecRequStat() {
		return execRequStat;
	}

	public void setExecRequStat(String execRequStat) {
		this.execRequStat = execRequStat;
	}

	public String getEtaxManaNum() {
		return etaxManaNum;
	}

	public void setEtaxManaNum(String etaxManaNum) {
		this.etaxManaNum = etaxManaNum;
	}

	public String getKindDivi() {
		return kindDivi;
	}

	public void setKindDivi(String kindDivi) {
		this.kindDivi = kindDivi;
	}

	public String getMeetDt() {
		return meetDt;
	}

	public void setMeetDt(String meetDt) {
		this.meetDt = meetDt;
	}

	public String getMeetPlac() {
		return meetPlac;
	}

	public void setMeetPlac(String meetPlac) {
		this.meetPlac = meetPlac;
	}

	public String getConsInst() {
		return consInst;
	}

	public void setConsInst(String consInst) {
		this.consInst = consInst;
	}

	public String getBizRegiNum() {
		return bizRegiNum;
	}

	public void setBizRegiNum(String bizRegiNum) {
		this.bizRegiNum = bizRegiNum;
	}

	public String getSendWhet() {
		return sendWhet;
	}

	public void setSendWhet(String sendWhet) {
		this.sendWhet = sendWhet;
	}

	public String getSendOpt() {
		return sendOpt;
	}

	public void setSendOpt(String sendOpt) {
		this.sendOpt = sendOpt;
	}

	public String getSendDd() {
		return sendDd;
	}

	public void setSendDd(String sendDd) {
		this.sendDd = sendDd;
	}

	public String getSendTm() {
		return sendTm;
	}

	public void setSendTm(String sendTm) {
		this.sendTm = sendTm;
	}

	public String getSendStatCd() {
		return sendStatCd;
	}

	public void setSendStatCd(String sendStatCd) {
		this.sendStatCd = sendStatCd;
	}

	public String getReceDd() {
		return receDd;
	}

	public void setReceDd(String receDd) {
		this.receDd = receDd;
	}

	public String getReceTm() {
		return receTm;
	}

	public void setReceTm(String receTm) {
		this.receTm = receTm;
	}

	public String getExecConfNum() {
		return execConfNum;
	}

	public void setExecConfNum(String execConfNum) {
		this.execConfNum = execConfNum;
	}

	public String getTranDd() {
		return tranDd;
	}

	public void setTranDd(String tranDd) {
		this.tranDd = tranDd;
	}

	public String getTranTm() {
		return tranTm;
	}

	public void setTranTm(String tranTm) {
		this.tranTm = tranTm;
	}

	public String getTranBk() {
		return tranBk;
	}

	public void setTranBk(String tranBk) {
		this.tranBk = tranBk;
	}

	public String getTranAccNum() {
		return tranAccNum;
	}

	public void setTranAccNum(String tranAccNum) {
		this.tranAccNum = tranAccNum;
	}

	public String getReciPrsn() {
		return reciPrsn;
	}

	public void setReciPrsn(String reciPrsn) {
		this.reciPrsn = reciPrsn;
	}

	public String getCancWhet() {
		return cancWhet;
	}

	public void setCancWhet(String cancWhet) {
		this.cancWhet = cancWhet;
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

	public String getRequSeri() {
		return requSeri;
	}

	public void setRequSeri(String requSeri) {
		this.requSeri = requSeri;
	}

	public int getTradInte() {
		return tradInte;
	}

	public void setTradInte(int tradInte) {
		this.tradInte = tradInte;
	}

}