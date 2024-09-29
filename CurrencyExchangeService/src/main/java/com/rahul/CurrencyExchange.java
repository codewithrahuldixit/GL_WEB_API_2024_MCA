package com.rahul;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {
	@Id
	private int id;
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;

	private long conversionMultiple;
	private String envirnoment;

	public String getEnvirnoment() {
		return envirnoment;
	}

	public void setEnvirnoment(String envirnoment) {
		this.envirnoment = envirnoment;
	}
	

	public CurrencyExchange(int id, String from, String to, long conversionMultiple, String envirnoment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.envirnoment = envirnoment;
	}

	public CurrencyExchange() {
		
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

	public long getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(long conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", envirnoment=" + envirnoment + "]";
	}

	
}
