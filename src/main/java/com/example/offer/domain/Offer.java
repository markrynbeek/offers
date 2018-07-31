package com.example.offer.domain;

import com.example.offer.util.DateUtility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;


/**
 All offers have a shopper friendly descriptions. We price all my offers up front in a defined currency.
 An offer is time-bounded, with the length of time an offer is valid for defined as part of the offer, and should
 expire automatically. Offers may also be explicitly cancelled before they expire.
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Offer {

    private Long id;

    @NotNull
    @Size(min = 5, message = "Enter at least five characters.")
    private String description;

    @NotNull
    @Size(min = 5, message = "Enter at least five characters.")
    private String productName;

    @NotNull
    @Min(value=0, message="Price should be greater than or equals to zero")
    private double price;

    @NotNull
    private String currency;

    @NotNull
    private int offerLength;

    @NotNull
    private boolean cancelled;

    private Date createdOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getOfferLength() {
        return offerLength;
    }

    public void setOfferLength(int offerLength) {
        this.offerLength = offerLength;
    }

    @JsonProperty
    public boolean isValid() {
        return !isCancelled() &&
                DateUtility.getSecondsBetween(DateUtility.toLocalDateTime(getCreatedOn()), LocalDateTime.now()) < 3600*24*offerLength;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
