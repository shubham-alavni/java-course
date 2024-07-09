package inner_class_practice;

// Use the following snippet as a guide to create an inner class called Inner inside the Outer class.
// nested class
// local inner class
// anonymous inner class
// static inner class
// use abstract class and interface

abstract class MyAbstarctClass {
  abstract void display();
}

interface MyInterface {
  void display();
}

class Outer {
  private int outerVar = 10;
  static int staticVar = 30;

  // nested class
  public class Inner {
    private int innerVar = 20;

    public void display() {
      System.out.println("OuterVar: " + outerVar + " InnerVar: " + innerVar);
    }
  }

  public void outerDisplay() {
    Inner in = new Inner();
    in.display();
  }

  // local inner class
  public void localInner() {
    class LocalInner {
      public void display() {
        System.out.println("Local Inner");
      }
    }

    LocalInner li = new LocalInner();
    li.display();
  }

  // anonymous inner class
  public void anonymousInner() {
    MyAbstarctClass mac = new MyAbstarctClass() {
      @Override
      void display() {
        System.out.println("Anonymous Inner");
      }
    };
    mac.display();
  }

  // static inner class
  static class StaticInner {
    public void staticInnerDisplay() {
      System.out.println("StaticVar: " + staticVar);
      // System.out.println("Static Inner" + outerVar); // cannot access non-static
      // member
      System.out.println("Static Inner");
    }
  }
}

/**
 * InnerOuter
 */
class InnerClassTest {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.outerDisplay();
    outer.localInner();
    outer.anonymousInner();

    Outer.Inner inner = outer.new Inner();
    inner.display();

    Outer.StaticInner si = new Outer.StaticInner();
    si.staticInnerDisplay();
  }
}
