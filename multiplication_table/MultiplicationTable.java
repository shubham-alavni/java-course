package multiplication_table;

import java.util.Scanner;

public class MultiplicationTable {

  private int number;

  MultiplicationTable(int number) {
    this.number = number;
  }

  void printMultiplicationTable() {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", number, i, number * i).println();
    }
  }

  public static void main(String args[]) {
    // get the number as input from the user
    System.out.println("Enter the number for print multiplication table: ");
    Scanner number = new Scanner(System.in);
    int num = number.nextInt();
    MultiplicationTable multiplicationTable = new MultiplicationTable(num);
    multiplicationTable.printMultiplicationTable();
  }
}
