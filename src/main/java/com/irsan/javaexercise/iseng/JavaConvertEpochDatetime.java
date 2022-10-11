package com.irsan.javaexercise.iseng;

import com.irsan.javaexercise.util.Helpers;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaConvertEpochDatetime {

    public static void main(String[] args) {

        long epochNow = Instant.now().toEpochMilli();
        System.out.println(epochNow);

        LocalDateTime ldtNow = Instant.ofEpochMilli(epochNow)
                .atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter formatNow = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTimeNow = ldtNow.format(formatNow);
        System.out.println(formatDateTimeNow);

        System.out.println("--------------<>--------------");

        long myBirth = 916160400000L;
        String strDate = "13-01-1999 12:41:15";

        String formatDatetime = Helpers.epochToDatetime(myBirth);
        System.out.println(formatDatetime);

        long epochMilli = Helpers.datetimeToEpoch(strDate);
        System.out.println(epochMilli);

    }

}
