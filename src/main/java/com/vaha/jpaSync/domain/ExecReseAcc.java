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

/* 과제집행연구원계좌정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_RESE_ACC")
public class ExecReseAcc extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACC_ID")
	@JsonProperty
	private long id; // 테이블ID

	@Column(nullable = false)
	@JsonProperty
	// @ManyToOne @JoinColumn(name = "MEMB_ID")
	private ExecReseStan execReseStan; // 협약과제연구원T_아이디

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록번호

	@Column(nullable = true, length = 30)
	@JsonProperty
	private String accNum; // 계좌_번호

	@Column(nullable = true, length = 3)
	@JsonProperty
	private String accBk; // 계좌_은행

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String certWhet; // 인증_여부

	@Builder
	public ExecReseAcc(ExecReseStan execReseStan, String reseRegiNum, String certWhet) {
		this.execReseStan = execReseStan;
		this.reseRegiNum = reseRegiNum;
		this.certWhet = certWhet;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}
}
