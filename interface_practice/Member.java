package interface_practice;

/**
 * Member
 */
public interface Member {
  int MAX_ITEMS = 100; // by default, public, static, and final

  public void callback(); // by default, public and abstract

  default void log() { // by default, public
    System.out.println("Logging...");
  }

  public static void staticMethod() {
    System.out.println("Static method");
  }
}
