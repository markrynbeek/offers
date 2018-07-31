package com.example.offer.service;

import com.example.offer.dao.CurrencyDAO;
import com.example.offer.dao.OfferDAO;
import com.example.offer.domain.Offer;
import com.example.offer.validation.OfferValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class OfferService {

    @Autowired
    OfferDAO offerDAO;

    @Autowired
    OfferValidator offerValidator;

    public Offer createOffer(Offer offer) {
        offerValidator.validate(offer);
        offer.setCreatedOn(new Date());
        return offerDAO.createOffer(offer);
    }

    public List<Offer> getAllOffers() {
        return offerDAO.getAllOffers();
    }

    public Offer getOffer(Long offerId) {
        if (StringUtils.isEmpty(offerId)) {
            throw new RuntimeException("No offer id provided");
        }
        Offer offer = offerDAO.getOffer(offerId);
        if (offer==null) {
            throw new RuntimeException("Offer does not exist ");
        }
        return offer;
    }

    public Offer updateOffer(Offer offer) {
        offerValidator.validate(offer);
        if (StringUtils.isEmpty(offer.getId())) {
            throw new RuntimeException("No id provided");
        }

        Offer existingOffer = offerDAO.getOffer(offer.getId());
        if (existingOffer==null) {
            throw new RuntimeException("Offer to update does not exist ");
        }

        // Update updateable attributes on existing object
        existingOffer.setDescription(offer.getDescription());
        existingOffer.setProductName(offer.getProductName());
        existingOffer.setPrice(offer.getPrice());
        existingOffer.setOfferLength(offer.getOfferLength());
        existingOffer.setCancelled(offer.isCancelled());

        return offerDAO.updateOffer(existingOffer);
    }


    public void deleteOffer (Long offerId) {
        if (StringUtils.isEmpty(offerId)) {
            throw new RuntimeException("No offer id provided");
        }
        Offer existingOffer = offerDAO.getOffer(offerId);
        if (existingOffer==null) {
            throw new RuntimeException("Offer to delete does not exist ");
        }
        offerDAO.deleteOffer(offerId);
    }
}
