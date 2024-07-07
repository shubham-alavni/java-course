package inheritance_practice;

public class InheritancePractice {
  public static void main(String[] args) {
    // Dynamic Method Dispatch
    Television tv = new SmartTV();
    tv.display(); // Shadowing display() method of Television, because SmartTV overrides it
    // tv.playVideo(); // Error: cannot find symbol because playVideo() is not a
    // method of Television
    tv.turnOn();
    SmartTV smartTv = new SmartTV();
    smartTv.browse();
    smartTv.playVideo();
  }
}
