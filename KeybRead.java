import java.util.Scanner;

/**
 * KeybRead
 */
public class KeybRead {

  public static void main(String[] args) {
    int x, y;
    System.out.println("Enter two numbers: ");
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    int z = x + y;
    System.out.println("Sum is: " + z);
  }
}