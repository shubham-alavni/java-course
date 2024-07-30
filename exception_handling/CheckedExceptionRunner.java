package exception_handling;

public class CheckedExceptionRunner {
  public static void main(String[] args) {
    try {
      someOtherMethod();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    someOtherMethod2();
  }

  // Checked exception, Because it is a checked exception, we need to handle it
  private static void someOtherMethod() throws InterruptedException {
    Thread.sleep(2000);
  }

  // Unchecked exception, Because it is an unchecked exception, we don't need to
  // handle it
  private static void someOtherMethod2() throws RuntimeException {
    System.out.println("someOtherMethod2");
  }

}
