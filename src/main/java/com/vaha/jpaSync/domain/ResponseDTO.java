package com.vaha.jpaSync.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO<T> {

//@ApiModelProperty(value="상태코드")

	private int code = 200;

//@ApiModelProperty(value="메시지")

	private String message;

//@ApiModelProperty(value="성공여부") 

	private boolean check = true;

//@ApiModelProperty(value="데이터")

	private T response;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

}