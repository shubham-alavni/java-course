package abstract_practice;

public class Circle extends Shape {

  public double radius;

  public Circle() {
    this(1);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void calculateArea() {
    area = Math.PI * radius * radius;
  }

  @Override
  public void calculatePerimeter() {
    perimeter = 2 * Math.PI * radius;
  }
}
