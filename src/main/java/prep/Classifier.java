package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Classifier {
  private int number;

  public Classifier(int number) {
    this.number = number;
  }

  public boolean hasFactor(int divisor) {
    return number % divisor == 0;
  }

  public Set<Integer> factors() {
    Set<Integer> factors = new HashSet<Integer>();
    for (int i = 1; i <= Math.sqrt(number); i++) {
      if (hasFactor(i)) {
        factors.add(i);
        factors.add(number / i);
      }
    }
    return factors;
  }

  public int sumFactors() {
    int sum = 0;
    for (int factor : factors()){
      sum += factor;
    }
    return sum;
  }
}
