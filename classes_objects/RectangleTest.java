package classes_objects;

// Use the Rectangle class

// Use Getters and Setters for Data Hiding
// Use Constructors - Default and Parameterized constructor
// Calculate Area and Perimeter of Rectangle
// check if the rectangle is a square or not

class Rectangle {
  private double length;
  private double breadth;

  // Default Constructor
  public Rectangle() {
    this.length = 0;
    this.breadth = 0;
  }

  // Parameterized Constructor
  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // Getters and Setters
  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    if (length > 0) {
      this.length = length;
    } else {
      this.length = 0;
    }
  }

  public double getBreadth() {
    return breadth;
  }

  public void setBreadth(double breadth) {
    if (breadth > 0) {
      this.breadth = breadth;
    } else {
      this.breadth = 0;
    }
  }

  // Calculate Area
  public double calculateArea() {
    return length * breadth;
  }

  // Calculate Perimeter
  public double calculatePerimeter() {
    return 2 * (length + breadth);
  }

  // Check if the rectangle is a square
  public boolean isSquare() {
    return length == breadth;
  }
}

public class RectangleTest {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.setLength(10);
    r1.setBreadth(20);
    System.out.println("Area of Rectangle: " + r1.calculateArea());
    System.out.println("Perimeter of Rectangle: " + r1.calculatePerimeter());
    System.out.println("Is Rectangle a Square: " + r1.isSquare());
    Rectangle r2 = new Rectangle(10, 10);
    System.out.println("Area of Rectangle: " + r2.calculateArea());
    System.out.println("Perimeter of Rectangle: " + r2.calculatePerimeter());
    System.out.println("Is Rectangle a Square: " + r2.isSquare());
  }
}
