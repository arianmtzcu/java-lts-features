package com.arian.example;

public class StringFeaturesExample {

   public static void main(String[] args) {
      final var str1 = " ";
      final var str2 = "Hello, World!";
      System.out.println("Is str1 blank? " + str1.isBlank());
      System.out.println("Is str2 blank? " + str2.isBlank());

      final var multilineString = "This is line 1\nThis is line 2\nThis is line 3";
      final var lines = multilineString.split("\n");
      for (var line : lines) {
         System.out.println(line);
      }

      final var str = "Hello! ";
      final var repeatedStr = str.repeat(3);
      System.out.println(repeatedStr);
   }

}
