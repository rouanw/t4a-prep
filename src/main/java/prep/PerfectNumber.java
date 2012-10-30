package prep;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
  private int number;

  public PerfectNumber(int number) {
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
