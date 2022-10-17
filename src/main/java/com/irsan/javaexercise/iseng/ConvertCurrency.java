package com.irsan.javaexercise.iseng;

import java.text.NumberFormat;
import java.util.Locale;

public class ConvertCurrency {
    public static void main(String[] args) {
        Locale localeID = new Locale("in", "ID");
        Integer number1 = 1309353278;
        printCurrentcy(localeID, number1);
        Long number2 = 13093532789642819L;
        printCurrentcy(localeID, number2);
        String number3 = "13093532789642819";
        printCurrentcy(localeID, number3);
    }

    public static void printCurrentcy(Locale locale, Object number) {
        Double a = null;
        if (number instanceof Integer) {
            int x = (Integer) number;
            a = Double.valueOf(x);
            System.out.println("from Integer");
        }
        if (number instanceof Long) {
            long x = (Long) number;
            a = Double.valueOf(x);
            System.out.println("from Long");
        }
        if (number instanceof String) {
            String x = (String) number;
            a = Double.parseDouble(x);
            System.out.println("from String");
        }
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        System.out.println(format.format(a));
    }
}
