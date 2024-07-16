package array_demos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
  // Data members
  private String name;
  private ArrayList<Integer> numberOfMarks = new ArrayList<>();

  // Constructor modified to accept variable arguments for numberOfMarks
  public Student(String name, int... numberOfMarks) {
    this.name = name;
    for (int mark : numberOfMarks) {
      this.numberOfMarks.add(mark);
    }
  }

  public String getName() {
    return name;
  }

  public int getNumberOfMarks() {
    return numberOfMarks.size();
  }

  public int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : numberOfMarks) {
      sum += mark;
    }
    return sum;
  }

  public int getMaximumMark() {
    // int maximumMark = Integer.MIN_VALUE;
    // for (int mark : numberOfMarks) {
    // if (mark > maximumMark) {
    // maximumMark = mark;
    // }
    // }
    // return maximumMark;
    return Collections.max(numberOfMarks);
  }

  public int getMinimumMark() {
    // int minimumMark = Integer.MAX_VALUE;
    // for (int mark : numberOfMarks) {
    // if (mark < minimumMark) {
    // minimumMark = mark;
    // }
    // }
    // return minimumMark;
    return Collections.min(numberOfMarks);
  }

  public BigDecimal getAverageMarks() {
    int sum = getTotalSumOfMarks();
    int number = getNumberOfMarks();
    return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
  }

  public void addNewMark(int mark) {
    numberOfMarks.add(mark);
  }

  public void removeMarkAtIndex(int index) {
    numberOfMarks.remove(index);
  }

  public String toString() {
    return name + " " + numberOfMarks;
  }

}
