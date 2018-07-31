package com.example.offer.dao.demo;

import com.example.offer.dao.OfferDAO;
import com.example.offer.domain.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OfferDAODemo implements OfferDAO{

    @Autowired
    OfferDemoDataStore offerDemoDataStore;


    @Override
    public Offer createOffer(Offer offer) {
        long id = offerDemoDataStore.getNextSequence(); // think what to move to service rather
        offer.setId(id);
        offerDemoDataStore.offers.put(offer.getId(),offer);
        return offer;
    }

    @Override
    public List<Offer> getAllOffers() {
        return new ArrayList(offerDemoDataStore.offers.values());
    }

    @Override
    public Offer getOffer(long id) {
        return offerDemoDataStore.offers.get(id);
    }

    @Override
    public void deleteOffer(long id) {
        offerDemoDataStore.offers.remove(id);
    }

    @Override
    public Offer updateOffer(Offer offer) {
        offerDemoDataStore.offers.put(offer.getId(),offer);
        return offer;
    }

}

