package oops_level_2;

public class Fan {
  // Data members - State
  private String make;
  private double radius;
  private String color;
  private boolean isOn;
  private byte speed; // 0 to 5

  // Constructor
  public Fan(String make, double radius, String color) {
    this.make = make;
    this.radius = radius;
    this.color = color;
  }

  // Methods - Behaviour
  public void switchOn() {
    isOn = true;
    changeSpeed((byte) 1);
  }

  public void switchOff() {
    isOn = false;
    changeSpeed((byte) 0);
  }

  public void changeSpeed(byte speed) {
    this.speed = speed;
  }

  // toString() method is overridden to print the object in a readable format
  @Override
  public String toString() {
    return String.format("Fan [make=%s, radius=%s, color=%s, isOn=%s, speed=%s]", make, radius, color, isOn, speed);
  }
}
