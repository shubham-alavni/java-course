package abstract_practice;

abstract public class Shape {
  public double area;
  public double perimeter;

  public Shape() {
    this.area = 0;
    this.perimeter = 0;
  }

  public Shape(double area, double perimeter) {
    this.area = area;
    this.perimeter = perimeter;
  }

  abstract public void calculateArea();

  abstract public void calculatePerimeter();
}
