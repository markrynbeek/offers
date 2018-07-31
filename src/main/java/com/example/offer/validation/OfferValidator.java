package com.example.offer.validation;

import com.example.offer.dao.CurrencyDAO;
import com.example.offer.domain.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OfferValidator {

    @Autowired
    CurrencyDAO currencyDAO;

    public void validate(Offer offer) {
        if (!isValidCurrency(offer)) {
            throw new RuntimeException("Invalid currency provided");
        }
    }

    private boolean isValidCurrency (Offer offer) {
        return offer !=null && offer.getCurrency()!=null &&
                currencyDAO.isValidCurrencyCode(offer.getCurrency());

    }


}
