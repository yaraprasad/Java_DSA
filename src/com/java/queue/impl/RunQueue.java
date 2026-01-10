package com.java.queue.impl;

public class RunQueue {
    public static void main(String[] args) {

        QueueJava queue = new QueueJava(3);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        queue.printQueue();
       // queue.offer(40);
        queue.poll();
        queue.printQueue();

        queue.poll();
        queue.printQueue();

        queue.poll();
        queue.printQueue();

        queue.poll();
        queue.printQueue();
    }
}
