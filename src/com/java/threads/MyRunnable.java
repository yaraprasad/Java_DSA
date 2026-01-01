package com.java.threads;

public class MyRunnable implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+" is executing the thread.");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
    }
}
