package big_decimal_usage;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
  public static void main(String[] args) {
    SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
    // Reference of BigDecimal taken because the return type of calculateTotalValue
    // is BigDecimal
    BigDecimal totalValue = calculator.calculateTotalValue(5);
    System.out.println(totalValue);
  }
}
