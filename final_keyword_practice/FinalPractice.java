package final_keyword_practice;

public class FinalPractice {
  // use the final keyword to create a final variable
  // use of final method
  // use of final class

  // use of final variable
  final int finalVariable = 10; // cannot be changed

  // use of final method
  final void finalMethod() { // cannot be overridden by subclasses
    System.out.println("This is a final method");
  }
}

final class FinalClass {
  // use of final class
  // cannot be extended
  void finalClassMethod() {
    System.out.println("Final class Method");
  }
}

// The final keyword is used to restrict the user. The final keyword can be used
// in many contexts. It can be used with variables, methods, and classes. Once a
// final variable has been assigned, it always contains the same value. If a
// final method is inherited by a subclass, the method cannot be overridden.
