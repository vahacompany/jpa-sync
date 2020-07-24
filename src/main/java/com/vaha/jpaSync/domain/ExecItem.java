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

/* 집행품목정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_ITEM")
public class ExecItem extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXIT_ID")
	@JsonProperty
	private long id; // 집행품목T_아이디

	@Column(nullable = false)
	@JsonProperty
	private long requId; // 과제집행요청T_아이디

	@Column(nullable = false, length = 20)
	@JsonProperty
	private String seri; // 일련번호

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String kindType; // 물품_구분

	@Column(nullable = false, length = 100)
	@JsonProperty
	private String itemNm; // 품목_명

	@Column(nullable = true, length = 100)
	@JsonProperty
	private String stan; // 규격

	@Column(nullable = true)
	@JsonProperty
	private String quan; // 수량

	@Column(nullable = true, length = 13)
	@JsonProperty
	private double unitPric; // 단가

	@Column(nullable = false, length = 13)
	@JsonProperty
	private double supyAmt; // 공급_액

	@Column(nullable = false, length = 13)
	@JsonProperty
	private double vat; // 부가세

	@Column(nullable = false, length = 13)
	@JsonProperty
	private double totaPurcAmt; // 총_구입_액

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String ntisRegiNum; // NTIS_등록_번호

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String ntisRegiDd; // NTIS_등록_일자

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String inspDd; // 검수_일자

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String inspPrsn; // 검수_자

	@Builder
	public ExecItem(long requId, String seri, String kindType, String itemNm, double supyAmt, double vat,
			double totaPurcAmt) {
		this.requId = requId;
		this.seri = seri;
		this.kindType = kindType;
		this.itemNm = itemNm;
		this.supyAmt = supyAmt;
		this.vat = vat;
		this.totaPurcAmt = totaPurcAmt;
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
