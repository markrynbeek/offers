package com.example.offer.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateUtility {

    public static LocalDateTime toLocalDateTime(Date d) {
        return Instant.ofEpochMilli( d.getTime() )
                .atZone( ZoneId.systemDefault() )
                .toLocalDateTime();
    }

    public static long getSecondsBetween(LocalDateTime from, LocalDateTime to) {
        return LocalDateTime.from(from).until(to, ChronoUnit.SECONDS);
    }

}
