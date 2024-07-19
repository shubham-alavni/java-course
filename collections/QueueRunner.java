package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// implement StringLengthComparator class
// to compare the length of two strings and sort them in ascending order of their length
class StringLengthComparator implements Comparator<String> {
  @Override
  public int compare(String value1, String value2) {
    return Integer.compare(value1.length(), value2.length());
  }
}

public class QueueRunner {
  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
    queue.addAll(List.of("Zebra", "Monkey", "Cat", "Dog", "Elephant", "Lion"));
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll()); // null
  }
}
