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

/* 집행출장정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_BRCH")
public class ExecBrch extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXBR_ID")
	@JsonProperty
	private long id;       // 집행출장T_아이디
	
	@Column(nullable = false)
	@JsonProperty
	private long requId;       // 과제집행요청T_아이디
	
	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호
	
	@Column(nullable = true, length = 20)
	@JsonProperty
	private String butrPrsn;     // 출장_자
	
	@Column(nullable = true, length = 255)
	@JsonProperty
	private String butrPupo;     // 출장_목적
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String butrStDd;    // 출장_시작_일자
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String butrEdDd;    // 출장_종료_일자
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String butrStTm;    // 출장_시작_시간
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String butrEdTm;    // 출장_종료_시간
	
	@Column(nullable = true, length = 100)
	@JsonProperty
	private String depaPlac;     // 출발_장소
	
	@Column(nullable = true, length = 100)
	@JsonProperty
	private String arriPlac;     // 도착_장소

	@Builder
	public ExecBrch(long requId, String reseRegiNum) {
		this.requId = requId;
		this.reseRegiNum = reseRegiNum;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
	
}
