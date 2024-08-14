package com.arian.example;

import static java.lang.StringTemplate.STR;

/**
 * This class demonstrates the use of string templates, a preview feature in Java 21.
 * String templates provide a concise and readable way to embed expressions
 * within string literals, simplifying the construction of complex strings.
 */
public class StringTemplatesExample {

   /**
    * The main method demonstrates how to use string templates to embed expressions
    * directly within a string. The template automatically evaluates the expressions
    * and constructs the final string.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      int x = 10;
      int y = 20;
      String template = STR."The sum of {x} and {y} is {x + y}.";
      System.out.println(template);  // Output: The sum of 10 and 20 is 30.
   }
}
