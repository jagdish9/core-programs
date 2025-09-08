package com.thread;

public class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("This is new thread");
    }

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();
    }
}
