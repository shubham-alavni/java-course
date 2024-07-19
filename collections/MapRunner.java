package collections;

import java.util.HashMap;

public class MapRunner {
  public static void main(String[] args) {
    // 1. Find the Ocurrances of each character in a string
    // 2. Find the Ocurrances of each word in a string
    String str = "This is an awesome occasion. This has never happened before.";

    HashMap<Character, Integer> occurances = new HashMap<>();
    char[] characters = str.toCharArray();

    for (char character : characters) {
      Integer integer = occurances.get(character);
      if (integer == null) {
        occurances.put(character, 1);
      } else {
        occurances.put(character, integer + 1);
      }
      // The above code can be written in a single line using getOrDefault method
      // occurances.put(character, occurances.getOrDefault(character, 0) + 1);
    }

    System.out.println(occurances);

    HashMap<String, Integer> wordOccurances = new HashMap<>();
    // Slso remove the special characters from the string
    String[] words = str.split("[ .]");

    for (String word : words) {
      wordOccurances.put(word, wordOccurances.getOrDefault(word, 0) + 1);
    }

    System.out.println("wordOccurances: " + wordOccurances);
  }
}
