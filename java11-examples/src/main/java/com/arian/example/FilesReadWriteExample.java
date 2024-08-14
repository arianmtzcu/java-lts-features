package com.arian.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesReadWriteExample {

   public static void main(String[] args) {
      // Get the current working directory (where the class is executed)
      final var projectDir = Path.of(System.getProperty("user.dir"));

      // Create a path for the file within the resources directory
      final var path = projectDir.resolve("java11-examples/src/main/resources/FilesReadWriteExample.txt");
      final var content = "Hello, Java 11!";

      try {
         // Writing string to file
         Files.writeString(path, content, StandardOpenOption.CREATE);

         // Reading string from file
         final var readContent = Files.readString(path);
         System.out.println("File content: " + readContent);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
