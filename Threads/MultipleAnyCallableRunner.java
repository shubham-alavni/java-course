package Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(10);

    List<CallableTask> tasks = List.of(new CallableTask("Stan"), new CallableTask("John"), new CallableTask("Lucy"),
        new CallableTask("Jane"), new CallableTask("Robert"));

    String result = executor.invokeAny(tasks);

    System.out.println("\n" + result);

    System.out.println("\n All tasks submitted");

    executor.shutdown();
  }
}
