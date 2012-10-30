package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classifier {
  private int number;

  public Classifier(int number) {
    this.number = number;
  }

  public List<Integer> factors() {

    List<Integer> factors = new ArrayList<Integer>();
    for (int i = 1; i <= number; i++) {
      if (isFactor(i))
        factors.add(i);
    }
    return factors;
  }

  private boolean isFactor(int i) {
    return number % i == 0;
  }
}
