package oops_level_2.abstract_classes_vs_interfaces;

interface Flyable {
  void fly();
}

class Bird implements Flyable {
  @Override
  public void fly() {
    System.out.println("Bird With wings");
  }
}

class Aeroplane implements Flyable {
  @Override
  public void fly() {
    System.out.println("Aeroplane With fuel");
  }
}

public class FlyableRunner {
  public static void main(String[] args) {
    Flyable flyingObjects[] = { new Bird(), new Aeroplane() };
    for (Flyable flyable : flyingObjects) {
      flyable.fly();
    }
  }
}
