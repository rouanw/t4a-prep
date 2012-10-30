package prep;

public class PerfectNumber {
  private int number;

  public PerfectNumber(int number) {
    this.number = number;
  }

  public boolean hasFactor(int factor) {
    return number % factor == 0;
  }
}
