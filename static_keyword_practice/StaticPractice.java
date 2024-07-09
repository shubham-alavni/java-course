package static_keyword_practice;

public class StaticPractice {
  // use the static keyword to create a static variable
  // use of static method
  // use of static block
  static int staticVariable = 10; // load when class is loaded

  static {
    System.out.println("This is a static block");
  }

  // use of static method
  static void staticMethod() {
    System.out.println("This is a static method");
  }
}
