package com.irsan.javaexercise.iseng;

public class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public void increment(int delta) {
        count += delta;
    }

    public void reset() {
        count = 0;
    }

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }

    public void reset2(Counter counter) {
        counter.reset();
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.setCount(5);
        c.increment();
        c.increment();
        c.increment();
        c.reset();
        c.increment(10);
        c.reset2(c);
        long data = c.getCount();
        System.out.println("data -> " + data);

    }
}
