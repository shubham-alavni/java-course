package interface_practice;

public class Customer implements Member {

  String name;

  public Customer(String name) {
    this.name = name;
  }

  @Override
  public void callback() {
    System.out.println("Customer callback: " + name);
  }
}
