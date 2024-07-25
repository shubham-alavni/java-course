package Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(10);

    List<CallableTask> tasks = List.of(new CallableTask("Stan"), new CallableTask("John"), new CallableTask("Lucy"),
        new CallableTask("Jane"), new CallableTask("Robert"));

    List<Future<String>> results = executor.invokeAll(tasks);

    for (Future<String> result : results) {
      System.out.println("\n" + result.get());
    }

    System.out.println("\n All tasks submitted");

    executor.shutdown();
  }
}
