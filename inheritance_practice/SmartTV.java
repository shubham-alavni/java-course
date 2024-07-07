package inheritance_practice;

public class SmartTV extends Television {
  public String os;
  public String model;

  public SmartTV() {
    this(32, "SONY", "Android", "KD-55X7000G");
  }

  public SmartTV(double screenSize, String brand, String os, String model) {
    super(screenSize, brand);
    this.os = os;
    this.model = model;
  }

  @Override
  public void display() {
    System.out.println("SmartTV: " + screenSize + " inches " + brand + " brand " + os + " OS " + model + " model");
  }

  public void browse() {
    System.out.println("Browsing the internet");
  }

  public void playVideo() {
    System.out.println("Playing video");
  }

  @Override
  public void turnOn() {
    System.out.println("SmartTV is turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("SmartTV is turned off");
  }
}
