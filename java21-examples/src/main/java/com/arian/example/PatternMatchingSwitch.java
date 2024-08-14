package com.arian.example;

/**
 * This class demonstrates the use of pattern matching in switch expressions,
 * a feature finalized in Java 21. Pattern matching in switch allows for
 * more concise and readable code by combining type checks and conditionals
 * directly in the switch cases.
 */
public class PatternMatchingSwitch {

   /**
    * The main method demonstrates how to use pattern matching in a switch expression.
    * It handles different types of input, including integers and strings,
    * and applies additional conditions within the case blocks.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      Object obj = "Hello, Java 21!";
      String result = switch (obj) {
         case Integer i -> "Integer with value " + i;
         case String s -> {
            if (s.length() > 5) {
               yield "Long String: " + s;
            } else {
               yield "Short String: " + s;
            }
         }
         default -> "Unknown type";
      };
      System.out.println(result);  // Output: Long String: Hello, Java 21!
   }
}
