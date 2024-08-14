package com.arian.example;

/**
 * The {@code SwitchExpressions} class demonstrates the use of switch expressions in Java,
 * a feature introduced in Java 12 and enhanced in later versions.
 * <p>
 * Switch expressions provide a more concise and flexible syntax for the switch statement,
 * allowing it to be used as an expression that returns a value.
 * They also support multiple labels in a case, and the use of the {@code ->} syntax to replace
 * the traditional {@code :} and {@code break} statement.
 * </p>
 */
public class SwitchExpressions {

   /**
    * The main method demonstrates the use of switch expressions to evaluate a value
    * based on the provided day of the week.
    * It uses the new syntax to determine the number of characters in the day name and assigns it to a variable.
    *
    * @param args the command-line arguments (not used)
    */
   public static void main(String[] args) {
      String day = "MONDAY";

      // Using a switch expression to evaluate and return a value
      int result = switch (day) {
         case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
         case "TUESDAY" -> 7;
         case "THURSDAY", "SATURDAY" -> 8;
         case "WEDNESDAY" -> 9;
         default -> throw new IllegalStateException("Invalid day: " + day);
      };

      System.out.println("The length of the day name is: " + result);  // Output: 6
   }
}
