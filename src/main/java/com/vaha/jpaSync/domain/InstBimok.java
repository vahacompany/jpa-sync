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

/* 협약기관비목정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_CONV_BIMOK")
public class InstBimok extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BIMOK_ID")
	@JsonProperty
	private long id; // 테이블아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCCd; // 협약_기관_코드

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String convInstNm; // 협약_기관_명

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String bimokGrouCd; // 비목_그룹_코드

	@Column(nullable = true, length = 10)
	@JsonProperty
	private String upBimokCd; // 상위_비목_코드

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String bimokCd; // 비목_코드

	@Column(nullable = false, length = 100)
	@JsonProperty
	private String bimokNm; // 비목_명

	@Builder
	public InstBimok(String convInstCCd, String bimokGrouCd, String bimokCd, String bimokNm) {
		this.convInstCCd = convInstCCd; // 협약_기관_코드
		this.bimokGrouCd = bimokGrouCd; // 비목_그룹_코드
		this.bimokCd = bimokCd; // 비목_코드
		this.bimokNm = bimokNm; // 비목_명
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
