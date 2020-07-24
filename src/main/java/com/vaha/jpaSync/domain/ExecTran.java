package com.vaha.jpaSync.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 집행이체정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_TRAN")
public class ExecTran extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	@JsonProperty
	private long requId; // 과제집행요청T_아이디

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String tranDd; // 이체_일자

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String tranTm; // 이체_시간

	@Column(nullable = true, length = 3)
	@JsonProperty
	private String tranBk; // 이체_은행

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String tranAccNum; // 이체_계좌_번호

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String hold; // 예금주

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String paymPlac; // 지급_처

	@Column(nullable = true)
	@JsonProperty
	private String paymAmt; // 지급_금액

	@Column(nullable = true)
	@JsonProperty
	private String fee; // 수수료
	
	@Builder
	public ExecTran(int requId) {
		this.requId = requId;
		this.setRegiDd(); // 등록_일자
		this.setRegiTm(); // 등록_시간
		this.setChanDd(); // 등록_일자
		this.setChanTm(); // 등록_시간
	}
}
