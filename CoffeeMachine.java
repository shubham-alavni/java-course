// Singleton class Demo
public class CoffeeMachine {
  private float coffeePowderQuantity;
  private float waterQuantity;
  private float sugarQuantity;
  private float milkQuantity;

  static private CoffeeMachine coffeeMachine = null; // static variable to hold the instance of CoffeeMachine because it
                                                     // is a singleton class and we need to return the same instance
                                                     // every time

  private CoffeeMachine() {
    coffeePowderQuantity = 0;
    waterQuantity = 0;
    sugarQuantity = 0;
    milkQuantity = 0;
  } // private constructor to restrict the instantiation of the CoffeeMachine class

  public void fillWater(float waterQty) {
    waterQuantity = waterQty;
  } // method to fill water in the coffee machine

  public void fillCoffeePowder(float coffeePowderQty) {
    coffeePowderQuantity = coffeePowderQty;
  } // method to fill coffee powder in the coffee machine

  public void fillSugar(float sugarQty) {
    sugarQuantity = sugarQty;
  } // method to fill sugar in the coffee machine

  public float getCoffee() {
    return 1.15f;
  }

  public static CoffeeMachine getCoffeeMachine() {
    if (coffeeMachine == null) {
      coffeeMachine = new CoffeeMachine();
    }
    return coffeeMachine;
  } // static method to return the instance of the CoffeeMachine class

  public static void main(String[] args) {
    CoffeeMachine coffeeMachine = CoffeeMachine.getCoffeeMachine();
    CoffeeMachine coffeeMachine1 = CoffeeMachine.getCoffeeMachine();
    CoffeeMachine coffeeMachine2 = CoffeeMachine.getCoffeeMachine();
    System.out.println("Same: " + (coffeeMachine == coffeeMachine1 && coffeeMachine1 == coffeeMachine2));
    coffeeMachine.fillCoffeePowder(2);
    coffeeMachine.fillWater(2);
    coffeeMachine.fillSugar(2);
    System.out.println("Coffee is ready: " + coffeeMachine.getCoffee());
  }
}
