package com.irsan.javaexercise;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String epochToDatetime(long epoch) {
        LocalDateTime ldt = Instant.ofEpochMilli(epoch)
                .atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = ldt.format(format);
        return formatDateTime;
    }

    public static long dateimeToEpoch(String datetime) {
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime zdt  = LocalDateTime.parse(datetime,dtf);
        long epochMilli = zdt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        return epochMilli;
    }

}
