package prep;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberTest {
  @Test
  public void shouldKnowTheDivisorsOfANumber() throws Exception {
    assertEquals(Arrays.asList(1, 2, 3, 6), new Number(6).divisors());
    assertEquals(Arrays.asList(1, 2, 4, 7, 14, 28), new Number(28).divisors() );
  }
}
