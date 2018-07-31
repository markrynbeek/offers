package com.example.offer.dao.demo;

import com.example.offer.domain.Currency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyDAOTest {

    @Autowired
    CurrencyDAODemo currencyDAODemo;

    @Test
    public void getCurrencies_allCurrencies_listNotEmpty() {
        List<Currency> allCurrencies = currencyDAODemo.getCurrencies();
        assertNotNull ("Expecting currency list not null", allCurrencies);
        assertTrue ("Expecting some currencies", allCurrencies.size() > 0 );
    }

    @Test
    public void getCurrencies_lookUpGBP_shouldExist() {
        assertTrue ("Expecting GBP as valid currency", currencyDAODemo.isValidCurrencyCode("GBP") );
    }

}
