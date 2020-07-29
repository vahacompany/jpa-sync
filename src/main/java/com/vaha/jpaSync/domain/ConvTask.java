package com.vaha.jpaSync.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 협약기관과제정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_TASK")
public class ConvTask extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	@Column(name = "TASK_ID")
	private long id; // 테이블아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	@NotNull
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 1000, unique = true)
	@JsonProperty
	private String convTaskNm; // 협약_과제_명

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String bimokGrouCd; // 비목_그룹_코드

	@Column(nullable = true, length = 10)
	@JsonProperty
	private String rrReseRegiNum; // 책임연구자_연구자_등록번호

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String rrNm; // 책임연구자_성명

	@Column(nullable = false, length = 4)
	@JsonProperty
	private String taskConvYy; // 과제_협약_년도

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String currRechStDd; // 당해_연구_시작_일자

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String currRechEdDd; // 당해_연구_종료_일자

	@Column(nullable = false, length = 20)
	@JsonProperty
	private String taskStat; // 과제_상태

	// 협약기관과제상세
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "convTask")
	@JoinColumn(name = "taskId")
	@JsonProperty
	private ConvTaskDeta convTaskDeta;

	// 참여연구원정보 List
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "taskId")
	@JsonProperty
	private List<ConvTaskMemb> convTaskMembs = new ArrayList<ConvTaskMemb>();

	// 협약과제예산정보 List
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "taskId")
	@JsonProperty
	private List<ConvTaskBudg> convTaskBudgs = new ArrayList<ConvTaskBudg>();

	// 협약과제정부출연금정보 List
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "taskId")
	@JsonProperty
	private List<ConvTaskCont> convTaskConts = new ArrayList<ConvTaskCont>();

	// 협약과제발급카드정보 List
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "taskId")
	@JsonProperty
	private List<ConvTaskCard> convTaskCards = new ArrayList<ConvTaskCard>();

	@Builder
	public ConvTask(String pConvInstCd, String pConvTaskNum, String pConvTaskNm, String pBimokGrouCd,
			String pRrReseRegiNum, String pRrNm, String pTaskConvYy, String pCurrRechStDd, String pCurrRechEdDd,
			String pTaskStat) {
		this.convInstCd = pConvInstCd;
		this.convTaskNum = pConvTaskNum;
		this.convTaskNm = pConvTaskNm;
		this.bimokGrouCd = pBimokGrouCd;
		this.rrReseRegiNum = pRrReseRegiNum;
		this.rrNm = pRrNm;
		this.taskConvYy = pTaskConvYy;
		this.currRechStDd = pCurrRechStDd;
		this.currRechEdDd = pCurrRechEdDd;
		this.taskStat = pTaskStat;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 변경_일자
		this.setChanTm(); // 변경_시간
	}

}
