package com.example.demo.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T>{
	
	
	private T responseList;
	private int responseCode;
	private String responseMessage;
		
	public Response(T responseList, int responseCode, String responseMessage) {
		super();
		this.responseList = responseList;
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}
	
	@JsonProperty("response")
	public T getT() {
		return responseList;
	}
	public void setT(T responseList) {
		this.responseList = responseList;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}
