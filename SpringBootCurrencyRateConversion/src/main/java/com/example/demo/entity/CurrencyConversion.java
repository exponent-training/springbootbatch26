package com.example.demo.entity;

import java.math.BigDecimal;

public class CurrencyConversion {

	private int id;
	
	private String fromCurrency;
	
	private String toCurrency;
	
	private BigDecimal conversionRate;

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

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", conversionRate=" + conversionRate + "]";
	}
	
	
}
