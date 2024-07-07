package string_details;

public class StringObjectCreation {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new String("JAVA");
    char[] ch = { 'D', 'E', 'V', 'A', 'N', 'D' };
    String s3 = new String(ch);
    byte b[] = { 65, 66, 67, 68, 69, 70 };
    String s4 = new String(b);
    String s5 = "Hello";
    String s6 = new String("Hello");

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s1 == s5); // true, because both are pointing to the same object
    System.out.println(s1 == s6); // false, because s6 is pointing to a different object
    System.out.println(s1.equals(s6));
  }
}
