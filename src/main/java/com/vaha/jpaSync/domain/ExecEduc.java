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

/* 집행교육자정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_EDUC")
public class ExecEduc extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXED_ID")
	@JsonProperty
	private long id;       // 집행교육자T_아이디
	
	@Column(nullable = false)
	@JsonProperty
	private long requId;       // 과제집행요청T_아이디
	
	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호
	
	@Column(nullable = true, length = 20)
	@JsonProperty
	private String educPrsn;     // 교육_자
	
	@Column(nullable = true, length = 40)
	@JsonProperty
	private String educNm;       // 교육기관_명
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String educStDd;    // 교육_시작_일자
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String educEdDd;    // 교육_종료_일자
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String educStTm;    // 교육_시작_시간
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String educEdTm;    // 교육_종료_시간
	
	@Builder
	public ExecEduc(long requId, String reseRegiNum) {
		this.requId = requId;
		this.reseRegiNum = reseRegiNum;
	}
}
