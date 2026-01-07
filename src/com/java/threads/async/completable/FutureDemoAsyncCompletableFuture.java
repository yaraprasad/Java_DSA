package com.java.threads.async.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureDemoAsyncCompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main method() start : Executed by thread : " + Thread.currentThread().getName());

        long startTime = System.currentTimeMillis();

        FutureDemoAsyncCompletableFuture future = new FutureDemoAsyncCompletableFuture();


        //Approach 1
        /*
        CompletableFuture<String> firstNameFuture = CompletableFuture.supplyAsync(future::getFirstName);
        CompletableFuture<String> lastNameFuture = CompletableFuture.supplyAsync(future::getLastName);
        System.out.println("main method() end  : Executed by thread : " + Thread.currentThread().getName());

        String firstName = firstNameFuture.get();
        String lastName = lastNameFuture.get();
        String finalName = firstName+" "+lastName;
        System.out.println(finalName);
        */

        //Approach 2
        CompletableFuture<String> firstNameFuture = CompletableFuture.supplyAsync(future::getFirstName);
        CompletableFuture<String> lastNameFuture = CompletableFuture.supplyAsync(future::getLastName);

        String finalName = firstNameFuture.thenCombine(lastNameFuture, (str1, str2) -> str1 + " " + str2).join();
        System.out.println(finalName);
        System.out.println("time taken to execute these tasks : "+(System.currentTimeMillis()-startTime)+" ms");

        //Output

//        main method() start : Executed by thread : main
//        getFirstName method() : Executed by thread : ForkJoinPool.commonPool-worker-1
//        getLastName method() : Executed by thread : ForkJoinPool.commonPool-worker-2
//        Prasad Yara
//        time taken to execute these tasks : 2036 ms

    }

    public String getFirstName(){
        System.out.println("getFirstName method() : Executed by thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  "Prasad";
    }

    public String getLastName(){
        System.out.println("getLastName method() : Executed by thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  "Yara";
    }

}
