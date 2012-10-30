package prep;

import java.util.ArrayList;
import java.util.List;

public class Number {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  public List<Integer> divisors() {
    List<Integer> divisors = new ArrayList<Integer>();
    for (int divisor = 1; divisor <= number; divisor++) {
      if (number % divisor == 0) {
        divisors.add(divisor);
      }
    }
    return divisors;
  }
}
