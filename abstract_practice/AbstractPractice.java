package abstract_practice;

public class AbstractPractice {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    circle.calculateArea();
    circle.calculatePerimeter();
    System.out.println("Circle Area: " + circle.area);
    System.out.println("Circle Perimeter: " + circle.perimeter);
  }
}
