package exception_handling;

class Amount {
  private String currency;
  private int amount;

  public Amount(String currency, int amount) {
    this.currency = currency;
    this.amount = amount;
  }

  // Unchecked Exception because it extends RuntimeException
  // public void add(Amount that) {
  // if (!this.currency.equals(that.currency)) {
  // throw new RuntimeException("Currency Mismatch");
  // }
  // this.amount += that.amount;
  // }

  public void add(Amount that) {
    if (!this.currency.equals(that.currency)) {
      throw new CurrencyMismatchException("Currency Mismatch " + this.currency + " & " + that.currency);
    }
    this.amount += that.amount;
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }
}

class CurrencyMismatchException extends RuntimeException {
  public CurrencyMismatchException(String message) {
    super(message);
  }
}

public class ThrowingExceptionRunner {
  public static void main(String[] args) {
    Amount amount1 = new Amount("USD", 10);
    Amount amount2 = new Amount("EUR", 20);
    amount1.add(amount2);
    System.out.println("After adding amount2 to amount1");
    System.out.println(amount1);
  }
}
