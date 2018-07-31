package com.example.offer.controller;

import com.example.offer.domain.Offer;
import com.example.offer.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/offer-demo")
public class OfferController {

    @Autowired
    OfferService offerService;

    @PostMapping(value = "/offer")
    public Offer createOffer(
            @Valid @RequestBody Offer offer) {
        return offerService.createOffer(offer);
    }

    @GetMapping(value = "/offers")
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @GetMapping(value = "/offer/{offerId}")
    public Offer getOffer(@PathVariable Long offerId) {
        return offerService.getOffer(offerId);
    }

    @PutMapping(value = "/offer")
    public Offer updateOffer(
            @Valid @RequestBody Offer offer) {
        return offerService.updateOffer(offer);
    }

    @DeleteMapping(value = "/offer/{offerId}")
    public void deleteOffer(@PathVariable Long offerId) {
        offerService.deleteOffer(offerId);
    }


}
