package com.example.offer.dao;

import com.example.offer.domain.Currency;

import java.util.List;

public interface CurrencyDAO {

    boolean isValidCurrencyCode(String code);

    List<Currency> getCurrencies();

}
