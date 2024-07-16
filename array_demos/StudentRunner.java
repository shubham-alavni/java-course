package array_demos;

import java.math.BigDecimal;

public class StudentRunner {
  public static void main(String[] args) {
    Student student = new Student("Shubham", 90, 80, 70, 60);
    int number = student.getNumberOfMarks();
    int sum = student.getTotalSumOfMarks();
    int maximumMark = student.getMaximumMark();
    BigDecimal average = student.getAverageMarks();

    student.addNewMark(35);
    student.addNewMark(23);

    student.removeMarkAtIndex(1);

    System.out.println("Number of marks: " + number);
    System.out.println("Sum of marks: " + sum);
    System.out.println("Maximum mark: " + maximumMark);
    System.out.println("Average mark: " + average);

    System.out.println(student);
  }
}
