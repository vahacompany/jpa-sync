package com.vaha.jpaSync.domain;

import java.sql.Clob;

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

/* 과제집행요청정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_REQU")
public class ExecRequ extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	@Column(name = "REQU_ID")
	private long id; // 테이블아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약기관코드

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convTaskNum; // 협약과제번호

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String bimokCd; // 비목코드

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String execRequDd; // 집행요청일자

	@Column(nullable = false, length = 20)
	@JsonProperty
	private String execRequSeri; // 집행요청일련번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String execRequTm; // 집행요청시간

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String execRequType; // 집행요청구분

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String execType; // 집행구분

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String execMeth; // 집행방법

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String resoNum; // 결의번호

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String resoDd; // 결의일자

	@Column(nullable = false)
	@JsonProperty
	private Clob resoCont; // 결의내용

	@Column(nullable = false)
	@JsonProperty
	private Long resoAmt; // 결의금액

	@Column(nullable = true, length = 13)
	@JsonProperty
	private float vat; // 부가세

	@Column(nullable = true, length = 3)
	@JsonProperty
	private String execBk; // 집행은행

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String execAccNum; // 집행계좌번호

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String execBkHold; // 집행은행예금주

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String resoConfNum; // 결의확인번호

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String cancDd; // 취소일자

	@Column(nullable = true, length = 1)
	@JsonProperty
	private String cancWhet; // 취소여부

	@Column(nullable = true, length = 1)
	@JsonProperty
	private String sendWhet; // 송신여부

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String sendOpt; // 송신옵션

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String sendDd; // 송신일자

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String sendTm; // 송신시간

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String sendStatCd; // 송신상태코드

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String receDd; // 수신일자

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String receTm; // 수신시간
	
//	@OneToOne
//	@JoinColumn(name = "REQU_ID")
	private ExecTran execTran; // 이체정보 TABLE

//	@OneToMany
//	@JoinColumn(name = "REQU_ID")
	//private List<ExecItem> execItem; // 집행품목정보 TABLE
	
//	@OneToMany
//	@JoinColumn(name = "REQU_ID")
	//private List<ExecBrch> execBrch; // 집행출장정보 TABLE
	
//	@OneToMany
//	@JoinColumn(name = "REQU_ID")
	//private List<ExecSplt> execSplt; // 집행전문가활용정보 TABLE
	
//	@OneToMany
//	@JoinColumn(name = "REQU_ID")
	//private List<ExecOvtm> execOvtm; // 집행특근정보 TABLE
	
//	@OneToOne
//	@JoinColumn(name = "REQU_ID")
	//private List<ExecRech> execRech; // 집행연구원정보 TABLE
	
//	@OneToOne
//	@JoinColumn(name = "REQU_ID")
	private ExecEtax execEtax; // 집행전자세금계산서정보 TABLE
	
//	@OneToOne
//	@JoinColumn(name = "REQU_ID")
	//private ExecCard execCard; // 집행카드정보 TABLE
	
//	@OneToOne
//	@JoinColumn(name = "TASK_ID")
	//private ConsAgny consAgny; // 위탁기관정보 TABLE
	
//	@OneToMany
//	@JoinColumn(name = "REQU_ID")
	//private List<ExecEduc> execEduc; // 집행교육자정보 TABLE

	@Builder
	public ExecRequ(String convInstCd, String convTaskNum, String bimokCd, String execRequDd, String execRequSeri,
			String execRequTm, String execRequType, String execType, String execMeth, String resoNum, String resoDd,
			Clob resoCont, Long resoAmt, float vat, String execBk, String execAccNum, String execBkHold) {
		this.convInstCd = convInstCd;
		this.convTaskNum = convTaskNum;
		this.bimokCd = bimokCd;
		this.execRequDd = execRequDd;
		this.execRequSeri = execRequSeri;
		this.execRequTm = execRequTm;
		this.execRequType = execRequType;
		this.execType = execType;
		this.execMeth = execMeth;
		this.resoNum = resoNum;
		this.resoDd = resoDd;
		this.resoCont = resoCont;
		this.resoAmt = resoAmt;
		this.vat = vat;
		this.execBk = execBk;
		this.execAccNum = execAccNum;
		this.execBkHold = execBkHold;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 등록_일자
		this.setChanTm(); // 등록_시간
	}

}