package com.arian.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;

/**
 * This class demonstrates the use of the SequencedCollection interface
 * introduced in Java 21. SequencedCollection provides a unified way to handle
 * collections with a defined encounter order, including lists and sets.
 */
public class SequencedCollectionsExample {

   /**
    * The main method shows how to use the SequencedCollection interface with
    * different collection types such as ArrayList and LinkedHashSet,
    * and how to access the first element in these collections.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      SequencedCollection<String> list = new ArrayList<>();
      list.add("First");
      list.add("Second");
      list.add("Third");

      SequencedCollection<String> set = new LinkedHashSet<>();
      set.add("Alpha");
      set.add("Beta");
      set.add("Gamma");

      System.out.println("List first element: " + list.getFirst());  // Output: First
      System.out.println("Set first element: " + set.getFirst());    // Output: Alpha
   }

}
