package com.example.offer.dao.demo;

import com.example.offer.domain.Offer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
/**
 * Demo-only class to store offers in memory.
 */
public class OfferDemoDataStore {

    private static long idSequence=0;

    public synchronized long getNextSequence() {
        return ++idSequence;
    }

    Map<Long,Offer> offers = new HashMap<>();

}
