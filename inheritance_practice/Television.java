package inheritance_practice;

/**
 * Television
 */
// Use Inheritance
// Use constructor in Inheritance
// use super() and this keyword
// Use Method Overriding
// use Dynamic Method Dispatch
public class Television {
  public double screenSize;
  public String brand;

  public Television() {
    this(32, "SONY");
  }

  public Television(double screenSize, String brand) {
    this.screenSize = screenSize;
    this.brand = brand;
  }

  public void display() {
    System.out.println("Television: " + screenSize + " inches " + brand + " brand");
  }

  public void turnOn() {
    System.out.println("Telivision is turned on");
  }

  public void turnOff() {
    System.out.println("Telivision is turned off");
  }
}