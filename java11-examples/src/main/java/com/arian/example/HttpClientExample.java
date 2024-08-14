package com.arian.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

   public static void main(String[] args) {
      try {
         final var client = HttpClient.newHttpClient();
         final var request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).build();

         final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
         System.out.println("Response body: " + response.body());
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}
