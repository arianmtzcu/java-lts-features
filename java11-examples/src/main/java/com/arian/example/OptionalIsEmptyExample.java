package com.arian.example;

import java.util.Optional;

public class OptionalIsEmptyExample {

   public static void main(String[] args) {
      final var optionalEmpty = Optional.empty();
      final var optionalPresent = Optional.of("Hello");

      System.out.println("Is optionalEmpty empty? " + optionalEmpty.isEmpty());
      System.out.println("Is optionalPresent empty? " + optionalPresent.isEmpty());
   }
}
