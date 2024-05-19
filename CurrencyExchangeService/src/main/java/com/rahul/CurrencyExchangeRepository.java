package com.rahul;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {
	public CurrencyExchange findByFromAndTo(String from, String to);
}
