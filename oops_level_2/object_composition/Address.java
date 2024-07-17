package oops_level_2.object_composition;

public class Address {
  // Data members - State
  private String line1;
  private String city;
  private int zip;

  // Constructor
  public Address(String line1, String city, int zip) {
    this.line1 = line1;
    this.city = city;
    this.zip = zip;
  }

  // toString() method is overridden to print the object in a readable format
  @Override
  public String toString() {
    return String.format("Address [line1=%s, city=%s, zip=%s]", line1, city, zip);
  }

}
