package com.example.offer.controller;

import com.example.offer.OfferApplication;
import com.example.offer.domain.Offer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OfferApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OfferControllerRestTemplateTest {

    @LocalServerPort
    private int port;

    private TestRestTemplate template = new TestRestTemplate();

    @Test
    public void postOffer_mandatoryFieldsSet_offerAddedAndIdSet() throws Exception {
        Offer body = createTestOffer();
        String uri = "/offer-demo/offer";

        ResponseEntity<Offer> responseEntity = template.postForEntity(createUrl(uri), body, Offer.class);

        assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
        assertNotNull(responseEntity.getBody().getId());
        assertTrue(responseEntity.getBody().getId() > 0);
        assertEquals("GBP", responseEntity.getBody().getCurrency());
        assertTrue(responseEntity.getBody().isValid());
        assertNotNull(responseEntity.getBody().getCreatedOn());
    }

    @Test
    public void postOffer_descriptionTooShort_exception() throws Exception {
        Offer body = createTestOffer();
        body.setDescription("123");
        String uri = "/offer-demo/offer";
        ResponseEntity<Offer> responseEntity = template.postForEntity(createUrl(uri), body, Offer.class);
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.BAD_REQUEST));
    }

    private String createUrl(String uri) {
        return "http://localhost:" + port + uri;

    }

    private Offer createTestOffer() {
        Offer testOffer = new Offer();
        testOffer.setId(1l);
        testOffer.setDescription("test offer");
        testOffer.setProductName("test product name");
        testOffer.setPrice(5);
        testOffer.setCurrency("GBP");
        testOffer.setOfferLength(10);
        testOffer.setCancelled(false);
        testOffer.setCreatedOn(new Date());
        return testOffer;
    }
}
