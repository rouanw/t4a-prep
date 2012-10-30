package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classifier {
  private int number;

  public Classifier(int number) {
    this.number = number;
  }

  public boolean hasFactor(int divisor) {
    return number % divisor == 0;
  }

  public List<Integer> factors() {
    List<Integer> factors = new ArrayList<Integer>();
    for (int i = 1; i <= number; i++) {
      if (hasFactor(i)) {
        factors.add(i);
      }
    }
    return factors;
  }
}
