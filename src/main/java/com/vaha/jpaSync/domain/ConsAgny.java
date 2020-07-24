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

/* 위탁기관정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONS_AGNY")
public class ConsAgny extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COAG_ID")
	@JsonProperty
	private long coagId;      // 위탁기관T_아이디
	
	@Column(nullable = false)
	@JsonProperty
	private long requId;      // 과제집행요청T_아이디
	
	@Column(nullable = false, length = 10)
	@JsonProperty
	private String instCd;      // 기관_코드
	
	@Column(nullable = false, length = 10)
	@JsonProperty
	private String bizRegiNum; // 사업자_등록_번호
	
	@Column(nullable = false, length = 40)
	@JsonProperty
	private String instNm;      // 기관_명
	
	@Builder
	public ConsAgny(long requId, String instCd) {
		this.requId = requId;
		this.instCd = instCd;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
	
}
