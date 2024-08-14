package com.arian.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MethodReferenceExamples {

   public static void main(String[] args) {
      // Example 1: Reference to a static method
      final List<String> names = Arrays.asList("John", "Daniel", "Jane", "Doe", "Diana");
      names.forEach(System.out::println);
      System.out.println("-------------");
      // Example 2: Reference to an instance method of a particular object
      final Printer printer = new Printer();
      names.forEach(printer::printMessage);

      // Example 3: Reference to an instance method of an arbitrary object of a particular type
      final Function<String, Integer> stringLength = String::length;
      final List<Integer> lengths = Arrays.asList(new Integer[names.size()]);
      for (int i = 0; i < names.size(); i++) {
         lengths.set(i, stringLength.apply(names.get(i)));
      }
      System.out.println("Lengths of names: " + lengths);

      // Example 4: Reference to a constructor
      final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      final List<MyNumber> myNumbers = Arrays.asList(new MyNumber[numbers.size()]);
      for (int i = 0; i < numbers.size(); i++) {
         myNumbers.set(i, new MyNumber(numbers.get(i)));
      }
      myNumbers.forEach(System.out::println);
   }

   static class Printer {

      void printMessage(final String message) {
         System.out.println(message);
      }
   }

   @Data
   @AllArgsConstructor
   static class MyNumber {

      private final int number;
   }
}
