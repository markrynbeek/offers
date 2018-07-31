package com.example.offer.validation;

import com.example.offer.dao.CurrencyDAO;
import com.example.offer.domain.Offer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableConfigurationProperties
public class OfferValidatorTest {

    @Mock
    private CurrencyDAO currencyDAO;

    @InjectMocks
    private OfferValidator offerValidator;


    @Test(expected = RuntimeException.class)
    public void validdate_mockInvalidcurrency_runtimeExceptionThrown() {
        when(currencyDAO.isValidCurrencyCode("FOO")).thenReturn(false);
        Offer o = new Offer();
        o.setCurrency("FOO");
        offerValidator.validate(o);
    }
}
