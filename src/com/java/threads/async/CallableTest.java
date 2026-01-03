package com.java.threads.async;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //To perform callable thing, we need to use the executor service
        //Executor services is a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> returnValueFromCallable = executorService.submit(new Task1());
        //System.out.println(returnValueFromCallable.get()); // blocking in nature
        for (int i = 0; i < 10; i++) {
            System.out.println("main method is running this line..." + " ran by thread.. " + Thread.currentThread().getName());
        }
        //Running Asynchronously
        //The main thread and the thread that we have created
        // are working asynchronously and doing there respective tasks.

        if (returnValueFromCallable.isDone()) {//check value done or not
            System.out.println(returnValueFromCallable.get()); // wait till the value to appear //blocking nature
        }
        //above step (if-block) is not a good solution for that
        //they have introduced completable future.
        //Future--> CompletableFuture --> ForkJoinPool/framework --> parallel stream --> Virtual Threads

    }
}

class Task1 implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("doing some task by callable..." + " ran by thread.. " + Thread.currentThread().getName());
        }
        return "done doing my task";
    }
}