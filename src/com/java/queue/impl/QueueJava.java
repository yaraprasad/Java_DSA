package com.java.queue.impl;

public class QueueJava {

    private int top;
    private final int size_of_queue;
    private final int[] queue;

    public QueueJava(int size){
        this.top=-1;
        this.size_of_queue = size;
        queue = new int[size];
    }

    public int size(){
        return top+1;
    }

    public boolean checkQueueEmpty(){
        return size() == 0;
    }
    public boolean checkQueueFull(){
        return size() == size_of_queue;
    }

    public void printQueue(){
        if(!checkQueueEmpty()){
            System.out.println("The queue is ");
            for (int i = 0; i <= top ; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public boolean offer(int x){
        if(!checkQueueFull()){
            System.out.println("Enqueue "+x);
            queue[++top] = x;
            return  true;
        }else {
            System.out.println("Queue is full ");
            Runtime.getRuntime().exit(1);
        }
        return  false;
    }

    public boolean poll(){
        if (!checkQueueEmpty()){
            System.out.println("Pop "+peek());
            top= top-1;
            return true;
        }else{
            System.out.println("Queue is empty");
            Runtime.getRuntime().exit(1);
            return false;
        }
    }

    public int peek(){
        if(!checkQueueEmpty()){
            return queue[top];
        }
        return 0;
    }
}
