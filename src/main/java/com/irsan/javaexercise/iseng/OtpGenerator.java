package com.irsan.javaexercise.iseng;

import java.util.Random;

public class OtpGenerator {

    public static char[] otpGenerete(int len) {
        String numbers = "0123456789";
        Random random = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++) {
            otp[i] = numbers.charAt(random.nextInt(numbers.length()));
        }
        return  otp;
    }

    public static void main(String[] args) {
        int leng = 7;
        System.out.println(otpGenerete(7));
    }

}
