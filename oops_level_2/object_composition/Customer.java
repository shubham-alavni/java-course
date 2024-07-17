package oops_level_2.object_composition;

public class Customer {
  // Data members - State
  private String name;
  private Address homeAddress;
  private Address workAddress;

  // Constructor
  public Customer(String name, Address homeAddress) {
    this.name = name;
    this.homeAddress = homeAddress;
  }

  // getter and setter methods
  public Address getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(Address workAddress) {
    this.workAddress = workAddress;
  }

  public Address getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  // toString() method is overridden to print the object in a readable format
  @Override
  public String toString() {
    return String.format("Customer [name=%s, homeAddress=%s, workAddress=%s]", name, homeAddress, workAddress);
  }

}
