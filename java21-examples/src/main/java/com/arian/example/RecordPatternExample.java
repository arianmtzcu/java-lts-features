package com.arian.example;

/**
 * This class demonstrates the use of record patterns in Java 21,
 * which allows the deconstruction of record objects directly within
 * pattern matching expressions. Record patterns make it easier to
 * work with immutable data containers.
 */
public class RecordPatternExample {

   /**
    * The main method demonstrates how to deconstruct a record using pattern matching.
    * It checks if the object is an instance of the Point record and extracts its components.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      Point point = new Point(5, 10);
      if (point instanceof Point(int x, int y)) {
         System.out.println("X: " + x + ", Y: " + y);  // Output: X: 5, Y: 10
      }
   }

   /**
    * A record representing a point in a 2D space with x and y coordinates.
    *
    * @param x the x-coordinate of the point
    * @param y the y-coordinate of the point
    */
   public record Point(int x, int y) {

   }

}
