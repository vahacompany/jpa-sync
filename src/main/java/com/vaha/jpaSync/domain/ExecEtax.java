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

/* 집행전자세금계산서정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_ETAX")
public class ExecEtax extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	@JsonProperty
	private long requId;   // 과제집행요청T_아이디
	
	@Column(nullable = false, length = 30)
	@JsonProperty
	private String apprNum;  // 승인_번호
	
	@Column(nullable = true, length = 40)
	@JsonProperty
	private String supyPrsn; // 공급_자
	
	@Column(nullable = true, length = 10)
	@JsonProperty
	private String bizNum;   // 사업자_번호
	
	@Builder
	public ExecEtax(int requId, String apprNum) {
		this.requId = requId;
		this.apprNum = apprNum;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
