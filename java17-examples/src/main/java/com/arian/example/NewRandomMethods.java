package com.arian.example;

import java.util.random.RandomGenerator;

/**
 * The {@code NewRandomMethods} class demonstrates the use of new methods introduced in the Random API in Java 17.
 * <p>
 * Java 17 introduced enhancements to the Random API, including new interfaces and methods for generating
 * random values more flexibly and efficiently. The {@code RandomGenerator} interface provides a standardized
 * way to access various random number generation algorithms. Additionally, methods like {@code nextInt(int origin, int bound)}
 * allow for generating random integers within a specified range more conveniently.
 * </p>
 */
public class NewRandomMethods {

   /**
    * The main method demonstrates the use of the new {@code nextInt(int origin, int bound)} method
    * from the {@code RandomGenerator} interface, which generates a random integer within the specified range.
    *
    * @param args the command-line arguments (not used)
    */
   public static void main(String[] args) {
      final RandomGenerator random = RandomGenerator.getDefault();
      // Generating a random integer between 1 (inclusive) and 10 (exclusive)
      final int randomInt = random.nextInt(1, 10);
      System.out.println("Random integer between 1 and 10: " + randomInt);
   }

}
