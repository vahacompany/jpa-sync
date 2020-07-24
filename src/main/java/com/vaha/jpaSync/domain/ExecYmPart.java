package com.vaha.jpaSync.domain;

import javax.persistence.AttributeOverride;
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

/* 과제집행연구원월별참여정보 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
@Table(name = "TB_EXEC_YM_PART")
@AttributeOverride(name = "id", column = @Column(name = "MEMB_ID"))
public class ExecYmPart extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MEMB_ID")
	@JsonProperty
	private long id; // 과제집행연구원월별참여T_아이디

	@Column(nullable = false)
	@JsonProperty
	// @ManyToOne @JoinColumn(name = "MEMB_ID")
	private ExecReseStan execReseStan; // 협약과제연구원

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String convInstCd; // 협약_기관_코드

	@Column(nullable = false, length = 30)
	@JsonProperty
	private String convTaskNum; // 협약_과제_번호

	@Column(nullable = false, length = 10)
	@JsonProperty
	private String reseRegiNum; // 연구자_등록_번호

	@Column(nullable = false)
	@JsonProperty
	private int regiOrde; // 등록_차수

	@Column(nullable = false, length = 6)
	@JsonProperty
	private String partYm; // 참여_년월

	@Column(nullable = false)
	@JsonProperty
	private int paymStanAmt; // 지급_기준_금액

	@Column(nullable = false)
	@JsonProperty
	private float partRate; // 참여_률

	@Builder
	public ExecYmPart(ExecReseStan execReseStan, String convInstCd, String convTaskNum, String reseRegiNum,
			int regiOrde, String partYm, int paymStanAmt, float partRate) {
		this.execReseStan = execReseStan; // 협약과제연구원
		this.convInstCd = convInstCd; // 협약_기관_코드
		this.convTaskNum = convTaskNum; // 협약_과제_번호
		this.reseRegiNum = reseRegiNum; // 연구자_등록_번호
		this.regiOrde = regiOrde; // 등록_차수
		this.partYm = partYm; // 참여_년월
		this.paymStanAmt = paymStanAmt; // 지급_기준_금액
		this.partRate = partRate; // 참여_률
		this.setRegiDd();
		this.setRegiTm();
		this.setChanDd();
		this.setChanTm();
	}

}
