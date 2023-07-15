package com.example.demo.entity;

import java.math.BigDecimal;

public class CurrencyConversion {

    private int id;
	
	private String fromCurrency;
	
	private String toCurrency;
	
	private BigDecimal conversionRate;
	
	private BigDecimal quantity;
	
	private BigDecimal totalAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", conversionRate=" + conversionRate + ", quantity=" + quantity + ", totalAmount=" + totalAmount
				+ "]";
	}
	
	
	
}
