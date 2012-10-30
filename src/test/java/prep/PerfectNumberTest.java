package prep;

import org.junit.Test;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

public class PerfectNumberTest {

  @Test
  public void shouldKnowIfANumberIsAFactor(){
    PerfectNumber six = new PerfectNumber(6);
    assertTrue(six.hasFactor(1));
    assertFalse(six.hasFactor(5));
  }

  @Test
  public void shouldKnowAllFactors(){
    PerfectNumber six = new PerfectNumber(6);
    assertEquals(asList(1, 2, 3, 6), six.getFactors());
  }
}
