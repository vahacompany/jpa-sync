package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;

/* 은행정보 */
@Getter
@NoArgsConstructor
@Entity
@Table(name="TB_BANK")
@AttributeOverride(name = "id", column = @Column(name = "BANK_ID"))
public class Bank extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@JsonProperty
	private long id;    // 테이블ID

	@Column(nullable = false, length = 3)	@JsonProperty
	private String bkCd;     // 은행_코드

	@Column(nullable = false, length = 40)	@JsonProperty
	private String bkNm;      // 은행_명

	@Column(nullable = false, length = 3)	@JsonProperty
	private String bkReplCd; // 은행_대체_코드
}
