package com.example.offer.dao;

import com.example.offer.domain.Offer;

import java.util.List;

public interface OfferDAO {

    Offer createOffer(Offer offer);

    Offer getOffer(long id);

    List<Offer> getAllOffers();

    Offer updateOffer(Offer offer);

    void deleteOffer(long id);

}
