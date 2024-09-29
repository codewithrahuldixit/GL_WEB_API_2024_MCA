package com.rahul;

public class CurrencyConversion {
	
	private int id;
	private String from;
	private String to;
	private long quantity;
	private long conversionMultiple;
	private long totalCalculatedAmount;
	private String envirnoment;

	public String getEnvirnoment() {
		return envirnoment;
	}

	public void setEnvirnoment(String envirnoment) {
		this.envirnoment = envirnoment;
	}

	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}
		public CurrencyConversion(int id, String from, String to, long quantity, long conversionMultiple,
			long totalCalculatedAmount, String envirnoment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.envirnoment = envirnoment;
	}
			public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(long conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public long getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(long totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", quantity=" + quantity
				+ ", conversionMultiple=" + conversionMultiple + ", totalCalculatedAmount=" + totalCalculatedAmount
				+ "]";
	}
	
}
