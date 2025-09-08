package com.thread;

public class RunnableTwo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runnable thread");
            }
        });

        thread.start();
    }
}
