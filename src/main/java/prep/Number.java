package prep;

import java.util.ArrayList;
import java.util.List;

public class Number {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  public boolean hasFactor(int factor) {
    return number % factor == 0;
  }

  public List<Integer> getFactors() {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    // todo make mistake of 0 here
    for (int num=1; num<=number; num++){
      if (hasFactor(num)){
        factors.add(num);
      }
    }
    return factors;
  }
}
