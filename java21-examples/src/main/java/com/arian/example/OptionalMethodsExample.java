package com.arian.example;

import java.util.Optional;

/**
 * This class demonstrates the new methods introduced in the Optional class in Java 21,
 * including ifPresentOrElse and or, which provide more convenient ways
 * to handle optional values.
 */
public class OptionalMethodsExample {

   /**
    * The main method demonstrates how to use the new methods in Optional to handle
    * present and absent values more gracefully, and to provide alternative values
    * when an optional is empty.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      Optional<String> optional = Optional.of("Java 21");

      // ifPresentOrElse method
      optional.ifPresentOrElse(value -> System.out.println("Value: " + value), () -> System.out.println("Value is absent"));

      // or method
      String result = optional.or(() -> Optional.of("Default")).get();
      System.out.println("Result: " + result);  // Output: Java 21
   }
}
