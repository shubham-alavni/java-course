package oops_level_2.object_composition;

public class CustomerRunner {
  public static void main(String[] args) {
    Address homeAddress = new Address("Line 1", "Mumbai", 40001);
    Customer customer = new Customer("John", homeAddress);
    System.out.println(customer);

    Address workAddress = new Address("Line 2", "Mumbai", 40002);
    customer.setWorkAddress(workAddress);
    System.out.println(customer);
  }
}
