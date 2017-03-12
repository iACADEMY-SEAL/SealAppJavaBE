package org.seal.model;

import java.util.List;

public class ResponseEntity {
	
	private List data;
	private int statusCode;
	private String message;
	
	public ResponseEntity(List data, int code, String message) {
		this.data = data;
		this.statusCode = code;
		this.message = message;
	}
	
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
