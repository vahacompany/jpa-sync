package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
//@AttributeOverride(name = "id", column = @Column(name = "TASK_ID"))
public class ConvTask extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	@Column(name = "TASK_ID")
	private long id; // 테이블아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	@NotNull private String convInstCd; // 협약_기관_코드

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

	@Builder
	public ConvTask(String convInstCd, String convTaskNum, String convTaskNm, String bimokGrouCd,
			String rrReseRegiNum) {
	    this.convInstCd = convInstCd;
	    this.convTaskNum = convTaskNum;
	    this.convTaskNm = convTaskNm;
	    this.bimokGrouCd = bimokGrouCd;
	    this.rrReseRegiNum = rrReseRegiNum;
	    this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
	    this.setChanDd(); // 등록_일자
		this.setChanTm(); // 등록_시간
	}

}
