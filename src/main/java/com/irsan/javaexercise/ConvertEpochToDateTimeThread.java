package com.irsan.javaexercise;

import java.time.Instant;

public class ConvertEpochToDateTimeThread extends Thread {

    @Override
    public void run() {
        long epoch2 = System.currentTimeMillis();
        System.out.println("epoch2: " + epoch2);

        long epoch1 = Instant.now().toEpochMilli();
        System.out.println("epoch1: " + epoch1);
    }

    public static void main(String[] args) {
        ConvertEpochToDateTimeThread epoch = new ConvertEpochToDateTimeThread();
        epoch.start();
    }
}
