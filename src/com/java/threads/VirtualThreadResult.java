//package com.java.threads;
//
//import static java.lang.IO.println;
//import static java.lang.Thread.sleep;
//
//
////java 25 support required
//public class VirtualThreadResult {
//
//
//    static void main() {
//
//
//        for (int i = 0; i < 100000; i++) {
//            Thread.ofPlatform().start(()-> {
//                try {
//                    sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                println("Hello");
//            });
//        }
//
//    }
//}
