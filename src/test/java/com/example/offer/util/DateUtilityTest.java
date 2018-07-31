package com.example.offer.util;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class DateUtilityTest {

    @Test
    public void getSecondsBetween_fromDateInThePast_expectPositiveNumber() {
        LocalDateTime from = LocalDateTime.of(2018, 07, 29, 0, 0, 0);
        LocalDateTime to =   LocalDateTime.of(2018, 07, 29, 0, 1, 0);
        assertEquals (60, DateUtility.getSecondsBetween(from,to));
    }

    @Test
    public void getSecondsBetween_fromDateInTheFuture_expectNegativeNumber() {
        LocalDateTime from = LocalDateTime.of(2018, 07, 1, 1, 0, 0);
        LocalDateTime to =   LocalDateTime.of(2018, 07, 1, 0, 0, 0);
        assertEquals (-3600, DateUtility.getSecondsBetween(from,to));
    }

    @Test
    public void getSecondsBetween_threeDayDifference_expectPositiveNumber() {
        LocalDateTime from = LocalDateTime.of(2018, 07, 10, 11, 5, 0);
        LocalDateTime to =   LocalDateTime.of(2018, 07, 13, 11, 5, 1);
        assertEquals (259201, DateUtility.getSecondsBetween(from,to));
    }

    @Test
    public void getSecondsBetween_ancientDate_expectHighPositiveNumber() {
        LocalDateTime from = LocalDateTime.of(1600, 07, 10, 11, 5, 0);
        LocalDateTime to =   LocalDateTime.of(2018, 07, 13, 11, 5, 1);
        assertEquals (13191033601l, DateUtility.getSecondsBetween(from,to));
    }

}
