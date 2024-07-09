package final_keyword_practice;

public class FinalTest {
  public static void main(String[] args) {
    // access the final variable
    FinalPractice finalPractice = new FinalPractice();
    System.out.println(finalPractice.finalVariable);
    // access the final method
    finalPractice.finalMethod();
    // access the final class method
    FinalClass finalClass = new FinalClass();
    finalClass.finalClassMethod();
  }
}
