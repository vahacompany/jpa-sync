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

/* 집행카드정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_CARD")
public class ExecCard extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXCA_ID")
	@JsonProperty
	private long id; // 집행카드T_아이디

	@Column(nullable = false)
	@JsonProperty
	private long requId; // 과제집행요청T_아이디

	@Column(nullable = false)
	@JsonProperty
	private String apprNum; // 승인_번호

	@Column(nullable = true, length = 16)
	@JsonProperty
	private String cardNum; // 카드_번호

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String claimSeri; // 청구_일련_번호

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String tradDd; // 거래_일자

	@Builder
	public ExecCard(long requId, String apprNum, String cardNum, String claimSeri, String tradDd) {
		this.requId = requId;
		this.apprNum = apprNum;
		this.cardNum = cardNum;
		this.claimSeri = claimSeri;
		this.tradDd = tradDd;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
