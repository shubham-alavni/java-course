package big_decimal_usage;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
  // Data members
  private BigDecimal principle;
  private BigDecimal interest;

  // public constructor
  public SimpleInterestCalculator(String principle, String interest) {
    this.principle = new BigDecimal(principle);
    this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
  }

  // public method
  public BigDecimal calculateTotalValue(int noOfYears) {
    BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
    BigDecimal totalValue = principle
        .add(principle
            .multiply(interest)
            .multiply(noOfYearsBigDecimal));
    return totalValue;
  }
}