package com.rewards.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Transaction {

	private String reference;
	private String customerID;
	private int amount;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date transactionDate;

	public Transaction() {
		super();
	}

	public Transaction(String reference, String customerID, int amount, Date transactionDate) {
		super();
		this.reference = reference;
		this.customerID = customerID;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String transactionRef) {
		this.reference = transactionRef;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Transaction [reference=" + reference + ", customerID=" + customerID + ", amount=" + amount
				+ ", transactionDate=" + transactionDate + "]";
	}

}
