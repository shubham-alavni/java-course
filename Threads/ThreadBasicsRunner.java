package Threads;

class Task1 extends Thread {
  @Override
  public void run() {
    System.out.println("Task 1 Started");
    for (int i = 101; i <= 199; i++) {
      System.out.print(i + " ");
    }
    System.out.println("Task 1 Done");
    System.out.println();
  }
}

class Task2 implements Runnable {
  @Override
  public void run() {
    System.out.println("Task 2 Started");
    for (int i = 201; i <= 299; i++) {
      System.out.print(i + " ");
    }
    System.out.println("Task 2 Done");
    System.out.println();
  }
}

public class ThreadBasicsRunner {
  public static void main(String[] args) throws InterruptedException {

    // Task 1
    System.out.println("Task 1 Kicked Off");
    Task1 task1 = new Task1();
    // Setting the priority of the task1 thread
    task1.setPriority(Thread.MAX_PRIORITY);
    task1.start();
    // task1.run(); // This will run the task1 in the main thread

    task1.join();

    // Task 2
    System.out.println("Task 2 Kicked Off");
    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);
    task2Thread.start();
    System.out.println();

    task2Thread.join();
    // Task 3
    System.out.println("Task 3 Kicked Off");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.println("Task 3 Done");
    System.out.println();
  }
}
