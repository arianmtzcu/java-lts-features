package com.arian.example;

import java.util.List;

public class CollectionToArrayExample {

   public static void main(String[] args) {
      final var list = List.of("A", "B", "C");

      // Converting List to Array
      final var array = list.toArray(String[]::new);

      for (var element : array) {
         System.out.println(element);
      }
   }
}

