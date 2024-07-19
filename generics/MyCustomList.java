package generics;

import java.util.ArrayList;
import java.util.List;

// If you want to allow only specific types of elements in the list, Only allow the Number type elements in the list, Then you can use <T extends Number>
public class MyCustomList<T> {
  List<T> list = new ArrayList<>();

  public void addElement(T element) {
    list.add(element);
  }

  public void removeElement(T element) {
    list.remove(element);
  }

  public T get(int index) {
    return list.get(index);
  }

}
