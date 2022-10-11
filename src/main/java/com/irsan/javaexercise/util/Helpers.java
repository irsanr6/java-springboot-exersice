package com.irsan.javaexercise.util;

import com.irsan.javaexercise.model.MessageResponse;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helpers {

    public static String epochToDatetime(long epoch) {
        LocalDateTime ldt = Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = ldt.format(format);
        System.out.println(ZoneId.systemDefault());
        return formatDateTime;
    }

    public static long datetimeToEpoch(String datetime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime zdt = LocalDateTime.parse(datetime, dtf);
        long epochMilli = zdt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(ZoneId.systemDefault());
        return epochMilli;
    }

    public static boolean checkRegex(String str) {
        Pattern regex = Pattern.compile("[:-]");
        Matcher hasRegex = regex.matcher(str);
        return hasRegex.find();
    }

    public static MessageResponse response(String message) {
        return MessageResponse.builder().message(message).build();
    }

    public static long getEpochNow() {
        return Instant.now().toEpochMilli();
    }

    public static String getDatetimeNow(long epochNow) {
        LocalDateTime ldtNow = Instant.ofEpochMilli(epochNow).atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter formatNow = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return ldtNow.format(formatNow);
    }

}
