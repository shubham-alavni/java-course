package collections;

public class Student implements Comparable<Student> {
  // Data members - State
  private int id;
  private String name;

  // Constructor
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("[Student id=%s, name=%s]", id, name);
  }

  @Override
  public int compareTo(Student that) {
    return Integer.compare(this.id, that.id);
  }

}
