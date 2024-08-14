package com.arian.example;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {

   public static void main(String[] args) {
      // Example 1: Predicate to check if a number is even
      final Predicate<Integer> isEven = number -> number % 2 == 0;
      System.out.println("Is 4 even? " + isEven.test(4));

      // Example 2: BiFunction to multiply two numbers
      final BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
      System.out.println("3 * 5 = " + multiply.apply(3, 5));

      // Example 3: Custom functional interface to convert a String to Integer
      final Converter<String, Integer> stringToInteger = Integer::valueOf;
      final Integer converted = stringToInteger.convert("123");
      System.out.println("\"123\" converted :: " + converted);
   }

   @FunctionalInterface
   interface Converter<F, T> {

      T convert(F from);
   }

}
