package com.arian.example;

/**
 * This class demonstrates the use of scoped values, an incubator feature in Java 21.
 * Scoped values provide a safer and more flexible alternative to thread-local variables,
 * allowing values to be bound to specific scopes and accessed within those scopes.
 */
public class ScopedValuesExample {

   static final ScopedValue<String> USER_ID = ScopedValue.newInstance();

   /**
    * The main method shows how to use a scoped value to bind a value
    * to a specific scope and access it within that scope.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      ScopedValue.where(USER_ID, "user123").run(() -> {
         System.out.println("Current User ID: " + USER_ID.get());  // Output: user123
      });
   }
}
