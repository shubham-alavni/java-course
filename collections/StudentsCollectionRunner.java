package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// implements Comparable<Student> is used to sort the list of students
class AscendingStudentComparator implements Comparator<Student> {
  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student1.getId(), student2.getId());
  }
}

public class StudentsCollectionRunner {
  public static void main(String[] args) {
    List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
    System.out.println(students);
    ArrayList<Student> studentsList = new ArrayList<>(students);
    // Collections.sort(studentsList, new AscendingStudentComparator());
    studentsList.sort(new AscendingStudentComparator());
    System.out.println(studentsList);

  }
}
