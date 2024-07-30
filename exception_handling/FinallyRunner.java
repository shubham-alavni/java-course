package exception_handling;

import java.util.Scanner;

public class FinallyRunner {
  public static void main(String[] args) {
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      int i[] = { 1, 2, 3, 4 };
      System.out.println("Enter an index: " + i[5]);
      // scanner.close(); // This line will not be executed, and memory leak will
      // occur
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      scanner.close();
      System.out.println("scanner closed");
      System.out.println("Finally block always executes");
    }
  }
}
