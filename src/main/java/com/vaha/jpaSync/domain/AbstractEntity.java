package com.vaha.jpaSync.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@MappedSuperclass
public class AbstractEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Transient
	SimpleDateFormat dd = new SimpleDateFormat("yyyyMMdd");
	
	@Transient
	SimpleDateFormat tm = new SimpleDateFormat("HHmmss");
	
	@Transient
	Calendar dateTime = Calendar.getInstance();

	@Column(nullable=false, length=8)
	@JsonProperty
	private String regiDd; // 등록일자

	@Column(nullable=false, length=6)
	@JsonProperty
	private String regiTm; // 등록시간
	
	@Column(nullable=true, length=8)
	@JsonProperty
	private String chanDd; // 변경일자

	@Column(nullable=true, length=6)
	@JsonProperty
	private String chanTm; // 변경시간
	
	public String getRegiDd() {
		return regiDd;
	}

	public void setRegiDd() {
		this.regiDd = dd.format(dateTime.getTime());
	}
	
	public void setRegiTm() {
		this.regiTm = tm.format(dateTime.getTime());
	}

	public void setChanDd() {
		this.chanDd = dd.format(dateTime.getTime());
	}
	
	public void setChanTm() {
		this.chanTm = tm.format(dateTime.getTime());
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "AbstractEntity [ regiDd=" + regiDd + ", regiTm=" + regiTm + "chanDd=" + chanDd + ", chanTm=" + chanTm + "]";
	}
}
