package com.example.demo.web;

public class TxrRequest {

	private String fromAccNumber;
	private String toAccNumber;
	private double amount;

	public String getFromAccNumber() {
		return fromAccNumber;
	}

	public void setFromAccNumber(String fromAccNumber) {
		this.fromAccNumber = fromAccNumber;
	}

	public String getToAccNumber() {
		return toAccNumber;
	}

	public void setToAccNumber(String toAccNumber) {
		this.toAccNumber = toAccNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
