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

/* 집행전문가활용정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_SPLT")
public class ExecSplt extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXSP_ID")
	@JsonProperty
	private long id;         // 집행전문가T_아이디
	
	@Column(nullable = false)
	@JsonProperty
	private long requId;         // 과제집행요청T_아이디
	
	@Column(nullable = false, length = 20)
	@JsonProperty
	private String nm;              // 성명', -- 성명                                          VARCHAR(20)  NOT NULL COMMENT '
	
	@Column(nullable = true, length = 40)
	@JsonProperty
	private String belo;            // 소속', -- 소속                                          VARCHAR(40)  NULL     COMMENT '
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String expeUsesMeth;  // 전문가_활용_방법', -- 전문가_활용_방법                  VARCHAR(6)   NULL     COMMENT '
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String expeUsesStDd; // 전문가_활용_시작_일자', -- 전문가_활용_시작_일자        VARCHAR(8)   NULL     COMMENT '
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String expeUsesEdDd; // 전문가_활용_종료_일자', -- 전문가_활용_종료_일자        VARCHAR(8)   NULL     COMMENT '
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String expeUsesStTm; // 전문가_활용_시작_시간', -- 전문가_활용_시작_시간        VARCHAR(6)   NULL     COMMENT '
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String expeUsesEdTm; // 전문가_활용_종료_시간', -- 전문가_활용_종료_시간        VARCHAR(6)   NULL     COMMENT '
	
	@Column(nullable = true, length = 100)
	@JsonProperty
	private String expeUsesPlac;  // 전문가_활용_장소', -- 전문가_활용_장소                  VARCHAR(100) NULL     COMMENT '
	
	@Column(nullable = true)
	@JsonProperty
	private long expeUsesAmt;   // 전문가_활용_금액
	
	@Builder
	public ExecSplt(long requId, String nm) {
		this.requId = requId;
		this.nm = nm;
	}

}
