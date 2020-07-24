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

/* 집행특근정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_OVTM")
public class ExecOvtm extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXOT_ID")
	@JsonProperty
	private long id;       // 집행특근T_아이디
	
	@Column(nullable = false)
	@JsonProperty
	private long requId;       // 과제집행요청T_아이디
	
	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호
	
	@Column(nullable = true, length = 20)
	@JsonProperty
	private String specPrsn;     // 특근_자
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String specStDd;    // 특근_시작_일자
	
	@Column(nullable = true, length = 8)
	@JsonProperty
	private String specEdDd;    // 특근_종료_일자
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String specStTm;    // 특근_시작_시간
	
	@Column(nullable = true, length = 6)
	@JsonProperty
	private String specEdTm;    // 특근_종료_시간
	
	@Builder
	public ExecOvtm(long requId, String reseRegiNum) {
		this.requId = requId;
		this.reseRegiNum = reseRegiNum;
	}

}
