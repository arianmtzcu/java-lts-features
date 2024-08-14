package com.arian.example;

import java.util.Optional;

public class OptionalExamples {

   public static void main(String[] args) {
      // Example 1: Creating an empty Optional
      final Optional<String> empty = Optional.empty();
      System.out.println("Empty optional: " + empty);

      // Example 2: Creating an Optional with a non-null value
      final Optional<String> nonEmpty = Optional.of("Hello");
      System.out.println("Non-empty optional: " + nonEmpty);

      // Example 3: Working with an Optional that might be null
      final Optional<String> nullableOptional = Optional.ofNullable(null);
      nullableOptional.ifPresent(System.out::println);

      // Example 4: Providing a default value if Optional is empty
      final String result = nullableOptional.orElse("Default value");
      System.out.println("Result: " + result);

      // Example 5: Transforming a value within an Optional using map
      final Optional<Integer> length = nonEmpty.map(String::length);
      System.out.println("Length of the string: " + length.orElse(0));
   }

}
