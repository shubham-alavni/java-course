package exception_handling;

public class ExceptionHandlingRunner {
  public static void main(String[] args) {
    method1();
    System.out.println("Main ends");
  }

  private static void method1() {
    method2();
    System.err.println("Method1 ends");
  }

  private static void method2() {
    try {
      // String str = null;
      // str.length();
      int i[] = { 1, 2, 3, 4 };
      System.out.println(i[5]);
      System.out.println("Method2 ends");
    } catch (NullPointerException e) {
      System.out.println("NullPointerException occurred");
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException occurred");
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
