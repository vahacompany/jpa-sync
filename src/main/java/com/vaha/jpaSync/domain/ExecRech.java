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

/* 집행연구원정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_RECH")
public class ExecRech extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	@Column(name = "EXRE_ID")
	private long id; // 연구원집행T_아이디

	@Column(nullable = false)
	@JsonProperty
	private String requId; // 과제집행요청T_아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String paymYm; // 지급_년월

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String belo; // 소속

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String nm; // 성명

	@Column(nullable = true)
	@JsonProperty
	private String rank; // 직급

	@Column(nullable = true)
	@JsonProperty
	private String partRate; // 참여_률

	@Column(nullable = true)
	@JsonProperty
	private int paymStanAmt; // 지급_기준_금액

	@Column(nullable = true)
	@JsonProperty
	private int realPaymAmt; // 실제_지급_금액

	@Column(nullable = true)
	@JsonProperty
	private int legaCounAmt; // 법정_부담_금액

	@Builder
	public ExecRech(String requId, String reseRegiNum, String paymYm) {
		this.requId = requId;
		this.reseRegiNum = reseRegiNum;
		this.paymYm = paymYm;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 등록_일자
		this.setChanTm(); // 등록_시간
	}
}
