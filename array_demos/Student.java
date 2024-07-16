package array_demos;

import java.math.BigDecimal;

public class Student {
  // Data members
  private String name;
  private int[] numberOfMarks;

  // Constructor
  public Student(String name, int[] numberOfMarks) {
    this.name = name;
    this.numberOfMarks = numberOfMarks;
  }

  public int getNumberOfMarks() {
    return numberOfMarks.length;
  }

  public int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : numberOfMarks) {
      sum += mark;
    }
    return sum;
  }

  public int getMaximumMark() {
    int maximumMark = Integer.MIN_VALUE;
    for (int mark : numberOfMarks) {
      if (mark > maximumMark) {
        maximumMark = mark;
      }
    }
    return maximumMark;
  }

  public int getMinimumMark() {
    int minimumMark = Integer.MAX_VALUE;
    for (int mark : numberOfMarks) {
      if (mark < minimumMark) {
        minimumMark = mark;
      }
    }
    return minimumMark;
  }

  public BigDecimal getAverageMarks() {
    int sum = getTotalSumOfMarks();
    int number = getNumberOfMarks();
    return new BigDecimal(sum).divide(new BigDecimal(number));
  }

}
