package com.arian.example;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class LambdaExamples {

   public static void main(String[] args) {
      // Example 1: Lambda expression as a Runnable
      final Runnable runnable = () -> System.out.println("Running in a lambda!");
      runnable.run();

      // Example 2: Lambda expression with a single parameter
      final GreetingService greetService = message -> System.out.println("Hello " + message);
      greetService.sayMessage("Lambda");

      // Example 3: Lambda expression with multiple parameters
      final MathOperation addition = (a, b) -> a + b;
      System.out.println("10 + 5 = " + operate(10, 5, addition));

      // Example 4: Lambda expression to filter a list
      final List<String> names = Arrays.asList("Brian", "Daniel", "John", "Jane", "Doe", "Diana");
      final StringJoiner result = new StringJoiner(", ");
      names.forEach(name -> {
         if (name.startsWith("D")) {
            result.add(name);
         }
      });
      System.out.println(result);
   }

   private static int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }

   interface GreetingService {

      void sayMessage(String message);
   }

   interface MathOperation {

      int operation(int a, int b);
   }
}
