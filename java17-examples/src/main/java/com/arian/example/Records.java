package com.arian.example;

import com.arian.example.model.Point;

/**
 * The {@code Records} class demonstrates the use of Java records, a feature introduced in Java 14 and stabilized in later versions.
 * <p>
 * A record in Java is a special kind of class that is a concise way to create immutable data carriers.
 * Records automatically generate methods like getters, {@code equals}, {@code hashCode}, and {@code toString}.
 * </p>
 * <p>
 * In this example, a {@code Point} record is used to represent a point in a 2D coordinate system with {@code x} and {@code y} coordinates.
 * The record's methods are automatically generated, allowing easy access to its fields.
 * </p>
 */
public class Records {

   /**
    * The main method demonstrates the creation and use of a record in Java.
    * It creates a {@code Point} object with specified {@code x} and {@code y} coordinates and prints them using the generated getter methods.
    *
    * @param args the command-line arguments (not used)
    */
   public static void main(String[] args) {
      Point p = new Point(1, 2);
      System.out.println(p.x());  // Output: 1
      System.out.println(p.y());  // Output: 2
   }

}
