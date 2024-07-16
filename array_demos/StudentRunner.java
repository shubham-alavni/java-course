package array_demos;

import java.math.BigDecimal;

public class StudentRunner {
  public static void main(String[] args) {
    Student student = new Student("Shubham", new int[] { 100, 97, 95, 89 });
    int number = student.getNumberOfMarks();
    int sum = student.getTotalSumOfMarks();
    int maximumMark = student.getMaximumMark();
    BigDecimal average = student.getAverageMarks();

    System.out.println("Number of marks: " + number);
    System.out.println("Sum of marks: " + sum);
    System.out.println("Maximum mark: " + maximumMark);
    System.out.println("Average mark: " + average);
  }
}
