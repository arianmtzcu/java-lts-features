package com.arian.example;

import static java.lang.foreign.Arena.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * This class demonstrates the use of the Foreign Function & Memory API,
 * which has been enhanced in recent versions of Java. This API allows Java programs
 * to interact with native code and memory outside the Java runtime environment
 * in a safe and efficient manner.
 */
public class ForeignFunctionMemoryAPIExample {

   /**
    * The main method shows how to allocate a native memory segment using
    * the Foreign Function & Memory API, and how to access the value stored
    * in that memory.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      // Try using the current API structure for memory management
      try (Arena arena = Arena.ofConfined()) {
         MemorySegment segment = arena.allocate(ValueLayout.JAVA_INT, 42);
         int value = segment.get(ValueLayout.JAVA_INT, 0);
         System.out.println("Value from memory segment: " + value);  // Output: 42
      }
   }
}
