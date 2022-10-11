package com.irsan.javaexercise.iseng;

import java.time.Instant;

public class MultipleThread extends Thread {
    private String message;

    public MultipleThread(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void run() {
        long epoch = Instant.now().toEpochMilli();
        System.out.println(getMessage() + " with epoch " + epoch);
    }
}

class DemoMultipleThread {
    public static void main(String[] args) {
        MultipleThread multipleThread = new MultipleThread("Thread 1");
        MultipleThread multipleThread2 = new MultipleThread("Thread 2");
        MultipleThread multipleThread3 = new MultipleThread("Thread 3");
        MultipleThread multipleThread4 = new MultipleThread("Thread 4");
        multipleThread.start();
        multipleThread2.start();
        multipleThread3.start();
        multipleThread4.start();
    }
}
