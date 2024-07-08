package interface_practice;

public class InterfacePractice {
  public static void main(String[] args) {
    Customer customer = new Customer("John");
    Member.staticMethod();
    System.out.println("MAX_ITEMS: " + Member.MAX_ITEMS);
    customer.callback();
  }
}
