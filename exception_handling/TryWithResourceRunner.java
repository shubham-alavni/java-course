package exception_handling;

import java.util.Scanner;

public class TryWithResourceRunner {
  public static void main(String[] args) {
    // Try with resources, no need to close the scanner, Because it implements
    // AutoCloseable interface
    try (Scanner scanner = new Scanner(System.in)) {
      int[] numbers = { 1, 2, 3, 4, 5 };
      int number = numbers[7];
      System.out.println("Enter an index" + number);
    }
  }
}
