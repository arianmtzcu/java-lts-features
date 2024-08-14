package com.arian.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

   public static void main(String[] args) {
      // Example 1: Filtering a list
      final List<String> names = Arrays.asList("Brian", "Daniel", "Arian", "John", "Jane", "Doe", "Diana");
      final List<String> filteredNames = names.stream().filter(name -> name.startsWith("D")).collect(Collectors.toList());
      System.out.println("Filtered Names: " + filteredNames);

      // Example 2: Sorting a list
      final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      final List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
      System.out.println("Sorted Names: " + sortedNames);

      // Example 3: Squared numbers
      final List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
      System.out.println("Squared Numbers: " + squaredNumbers);

      // Example 4: Calculating sum
      final int sum = numbers.stream().reduce(0, Integer::sum);
      System.out.println("Sum: " + sum);

      // Example 5: Using streams with strings
      final String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
      System.out.println("Concatenated Names: " + concatenatedNames);
   }

}
