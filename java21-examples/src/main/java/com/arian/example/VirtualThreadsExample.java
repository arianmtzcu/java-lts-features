package com.arian.example;

/**
 * This class demonstrates the use of virtual threads, a feature introduced in Java 21
 * as part of Project Loom. Virtual threads allow for lightweight concurrency,
 * enabling the creation of thousands or even millions of threads without
 * overwhelming system resources.
 */
public class VirtualThreadsExample {

   /**
    * The main method shows how to create and manage virtual threads using
    * an executor service designed for virtual threads. This example creates
    * multiple virtual threads and prints a message from each.
    *
    * @param args command-line arguments (not used)
    * @throws InterruptedException if the thread is interrupted while waiting
    */
   public static void main(String[] args) throws InterruptedException {
      try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
         for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
               System.out.println("Hello from virtual thread " + Thread.currentThread());
            });
         }
      } // The executor is closed automatically
   }

}
