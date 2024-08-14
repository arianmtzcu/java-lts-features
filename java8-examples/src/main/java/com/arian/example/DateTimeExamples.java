package com.arian.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExamples {

   public static void main(String[] args) {
      // Example 1: Getting the current date
      final LocalDate today = LocalDate.now();
      System.out.println("Today's date: " + today);

      // Example 2: Getting the current time
      final LocalTime currentTime = LocalTime.now();
      System.out.println("Current time: " + currentTime);

      // Example 3: Creating a specific date and time
      final LocalDateTime dateTime = LocalDateTime.of(2024, 8, 12, 14, 30);
      System.out.println("Specific date and time: " + dateTime);

      // Example 4: Formatting dates and times
      final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
      final String formattedDate = dateTime.format(formatter);
      System.out.println("Formatted date and time: " + formattedDate);

      // Example 5: Adding days to a date
      final LocalDate nextWeek = today.plusDays(7);
      System.out.println("Date next week: " + nextWeek);

      // Example 6: Handling time zones
      final ZoneId zoneId = ZoneId.of("America/Montevideo");
      final ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
      System.out.println("Current date and time in Montevideo: " + zonedDateTime);
   }

}
