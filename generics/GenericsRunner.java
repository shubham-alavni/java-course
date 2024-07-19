package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

  // <X> is a generic type, which means it can be any type
  // The return type of this method is X, which means it can be any type
  public static <X> X doubleValue(X value) {
    return value;
  }

  public static <X extends List<Integer>> void duplicate(X list) {
    list.addAll(list);
  }

  // wildcard ? means any type upper bounded by Number
  static double add(List<? extends Number> numbers) {
    double sum = 0.0;
    for (Number number : numbers) {
      sum += number.doubleValue();
    }
    return sum;
  }

  // wildcard ? means any type lower bounded by Number
  static void addNumbers(List<? super Number> numbers) {
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  public static void main(String[] args) {
    MyCustomList<String> stringList = new MyCustomList<>();
    stringList.addElement("Element 1");
    stringList.addElement("Element 2");
    System.out.println(stringList);
    System.out.println(stringList.get(0));

    MyCustomList<Integer> integerList = new MyCustomList<>();
    integerList.addElement(1);
    integerList.addElement(2);
    System.out.println(integerList);
    System.out.println(integerList.get(0));

    Integer integerValue = doubleValue(Integer.valueOf(5));
    System.out.println(integerValue);
    String strValue = doubleValue("Hello");
    System.out.println(strValue);
    Double doubleValue = doubleValue(Double.valueOf(5.0));
    System.out.println(doubleValue);

    ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
    duplicate(numbers);
    System.out.println(numbers);

    List emptyList = new ArrayList<>();
    addNumbers(emptyList);
    System.out.println(emptyList);
  }
}
