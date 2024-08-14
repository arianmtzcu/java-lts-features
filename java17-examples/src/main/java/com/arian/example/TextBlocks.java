package com.arian.example;

/**
 * The {@code TextBlocks} class demonstrates the use of text blocks in Java,
 * a feature introduced in Java 13 and stabilized in later versions.
 * <p>
 * Text blocks provide a more concise and readable way to create multiline strings in Java,
 * eliminating the need for most escape sequences and preserving the format of the text as written in the code.
 * This makes it easier to work with strings that span multiple lines, such as JSON, XML, SQL, or HTML.
 * </p>
 */
public class TextBlocks {

   /**
    * The main method demonstrates how to use a text block to create a multiline string
    * and print it to the console.
    * The text block represents a JSON object formatted over multiple lines for readability.
    *
    * @param args the command-line arguments (not used)
    */
   public static void main(String[] args) {
      // Using a text block to create a multiline JSON string
      final String json = """
            {
                "name": "John Doe",
                "age": 30,
                "city": "New York"
            }
            """;

      System.out.println(json);
   }
}
