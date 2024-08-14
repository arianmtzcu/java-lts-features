package com.arian.example;

import java.util.List;

/**
 * The {@code EnhancedStreamAPI} class demonstrates the use of the enhanced Stream API in Java,
 * with additional methods introduced in Java 9 and later versions.
 * <p>
 * The Stream API in Java allows for functional-style operations on streams of elements,
 * such as filtering, mapping, and reducing. In later versions of Java,
 * the Stream API was enhanced with new methods like {@code takeWhile}, {@code dropWhile}, and {@code ofNullable}.
 * These methods provide more powerful and expressive ways to manipulate streams.
 * </p>
 */
public class EnhancedStreamAPI {

   /**
    * The main method demonstrates the use of the {@code takeWhile} method in the Stream API,
    * which allows you to take elements from a stream as long as a given predicate is true.
    * In this example, it processes a list of strings and prints out elements
    * with a length less than 4 characters.
    *
    * @param args the command-line arguments (not used)
    */
   public static void main(String[] args) {
      List<String> strings = List.of("one", "two", "three", "four");

      // Using the takeWhile method to process the stream
      strings.stream()
             .takeWhile(s -> s.length() < 4)
             .forEach(System.out::println);  // Output: one two
   }

}
