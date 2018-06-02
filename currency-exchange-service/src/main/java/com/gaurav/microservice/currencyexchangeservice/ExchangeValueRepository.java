package com.gaurav.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.microservice.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends 
					JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
