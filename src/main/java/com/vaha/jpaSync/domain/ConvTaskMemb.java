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

/* 협약과제연구원정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_TASK_MEMB")
public class ConvTaskMemb extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEMB_ID")
	@JsonProperty
	private long id; // 테이블ID

	@Column(nullable = false)
	@JsonProperty
	private long taskId;

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String rechType; // 연구자_구분

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호

	@Column(nullable = false, length = 20)
	@JsonProperty
	private String nm; // 성명

	@Column(nullable = true, length = 50)
	@JsonProperty
	private String nmEng; // 성명_영문

	@Column(nullable = false, length = 8)
	@JsonProperty
	private String birt; // 생년월일

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String depa; // 소속부서

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String spot; // 직위

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String mobi; // 핸드폰

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String tel; // 전화

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String fax; // 팩스

	@Column(nullable = true, length = 50)
	@JsonProperty
	private String email; // 이메일

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String zip; // 우편번호

	@Column(nullable = true, length = 200)
	@JsonProperty
	private String addr; // 주소

	@Builder
	public ConvTaskMemb(long pTaskId, String pConvInstCd, String pConvTaskNum, String pRechType, String pReseRegiNum,
			String pNm, String pBirt) {
		this.taskId = pTaskId; // 협약기관과제
		this.convInstCd = pConvInstCd; // 협약_기관_코드
		this.convTaskNum = pConvTaskNum; // 협약_과제_번호
		this.rechType = pRechType; // 연구자_구분
		this.reseRegiNum = pReseRegiNum; // 연구자_등록_번호
		this.nm = pNm; // 성명
		this.birt = pBirt; // 생년월일
	}

}
