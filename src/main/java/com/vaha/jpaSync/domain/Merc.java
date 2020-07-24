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

/* 가맹점정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_MERC")
public class Merc extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MERC_ID")
	@JsonProperty
	private String id; // 가맹점T

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String merc_num; // 가맹점_번호

	@Column(nullable = false, length = 100)
	@JsonProperty
	private String merc_nm; // 가맹점_명

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String biz_regi_num; // 사업자_등록번호

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String busi_cd; // 업종_코드

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String mc_cd; // 가맹점국제업종_코드

	@Column(nullable = true, length = 40)
	@JsonProperty
	private String mc_nm; // 가맹점국제업종_명

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String merc_tel; // 가맹점_전화

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String merc_zip; // 가맹점_우편번호

	@Column(nullable = true, length = 200)
	@JsonProperty
	private String merc_base_addr; // 가맹점_기본_주소

	@Column(nullable = true, length = 200)
	@JsonProperty
	private String merc_deta_addr; // 가맹점_상세_주소

	@Column(nullable = true, length = 20)
	@JsonProperty
	private String merc_repre_nm; // 가맹점_대표자_명

	@Column(nullable = true, length = 6)
	@JsonProperty
	private String tax_type_cd; // 과세_유형_코드

	@Column(nullable = false, length = 1)
	@JsonProperty
	private String clos_whet; // 폐업_여부

	@Column(nullable = true, length = 8)
	@JsonProperty
	private String clos_dd; // 폐업_일자

	@Builder
	public Merc(String merc_num, String merc_nm, String biz_regi_num, String clos_whet) {
		this.merc_num = merc_num; // 가맹점_번호
		this.merc_nm = merc_nm; // 가맹점_명
		this.biz_regi_num = biz_regi_num; // 사업자_등록번호
		this.clos_whet = clos_whet; // 폐업_여부
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
