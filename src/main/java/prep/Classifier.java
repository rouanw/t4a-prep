package prep;

public class Classifier {
  private int number;

  public Classifier(int number) {
    this.number = number;
  }

  public boolean hasFactor(int divisor) {
    return number % divisor == 0;
  }
}
