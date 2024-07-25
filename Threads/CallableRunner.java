package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

  private String name;

  public CallableTask(String name) {
    this.name = name;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(1000); // Simulating a long running task
    return "Hello " + name;
  }
}

public class CallableRunner {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(1);

    // Future is a placeholder for a result
    // that will be available in the future
    // Future is not a result, Iti is promise of a result, That will be available in
    // the future
    Future<String> welcomeFuture = executor.submit(new CallableTask("Stan"));

    System.out.println("\n new CallableTask(\"Stan\") executed");

    String msg = welcomeFuture.get();

    System.out.println("\n Message received: " + msg);

    System.out.println("\n Main completed"); // This will be printed after the Future is completed

    executor.shutdown();

  }
}
