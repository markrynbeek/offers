package com.example.offer.controller;

import com.example.offer.domain.Offer;
import com.example.offer.service.OfferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(OfferController.class)
public class OfferControllerMockMvcTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private OfferService offerService;

    @Test
    public void invokeGetOffer_offerIdProvided_expectValidJsonRepresentation () throws Exception {

        Offer testOffer = createTestOffer();
        when(offerService.getOffer(anyLong())).thenReturn(testOffer);

        MvcResult result = mvc
                .perform(MockMvcRequestBuilders.get("/offer-demo/offer/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        String expectedContent  = "\"valid\":true}";
        String responseContent = result.getResponse().getContentAsString();
        assertTrue(responseContent.contains(expectedContent));

    }

    @Test
    public void invokeGetOffer_noOfferIdProvided_expectClientError () throws Exception {

        Offer testOffer = createTestOffer();
        when(offerService.getOffer(anyLong())).thenReturn(testOffer);

        MvcResult result = mvc
                .perform(MockMvcRequestBuilders.get("/offer-demo/offer/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError()).andReturn();
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
