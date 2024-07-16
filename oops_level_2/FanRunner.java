package oops_level_2;

public class FanRunner {
  public static void main(String[] args) {
    Fan fan = new Fan("USHA", 0.456, "GREEN");
    fan.switchOn();
    fan.changeSpeed((byte) (3));
    System.out.println(fan);
    fan.switchOff();
    System.out.println(fan);
    fan.switchOn();
    System.out.println(fan);
  }
}
