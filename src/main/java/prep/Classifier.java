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
    return Arrays.asList(1);
  }
}
