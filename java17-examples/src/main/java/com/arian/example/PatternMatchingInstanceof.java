package com.arian.example;

/**
 * The {@code PatternMatching} class demonstrates the use of pattern matching with the {@code instanceof} operator,
 * a feature introduced in Java 17.
 * <p>
 * Pattern matching simplifies the use of the {@code instanceof} operator by allowing you to test if an object is an instance
 * of a certain type and cast it to that type in a single step.
 * </p>
 * <p>
 * In this example, if the {@code obj} variable is an instance of {@code String}, it is automatically cast to a variable {@code s}
 * of type {@code String}, which can then be used within the scope of the {@code if} statement.
 * </p>
 */
public class PatternMatchingInstanceof {

   /**
    * The main method demonstrates pattern matching with the {@code instanceof} operator.
    * It checks if the {@code obj} variable is an instance of {@code String}, and if so,
    * it prints the uppercase version of the string.
    *
    * @param args the command-line arguments (not used)
    */
   public static void main(String[] args) {
      Object obj = "Hello, Java 17!";
      if (obj instanceof String s) {
         System.out.println(s.toUpperCase());  // Output: HELLO, JAVA 17!
      }
   }
}
