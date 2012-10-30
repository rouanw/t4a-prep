package prep;

import org.junit.Test;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

public class NumberTest {

  @Test
  public void shouldKnowIfANumberIsAFactor(){
    Number six = new Number(6);
    assertTrue(six.hasFactor(1));
    assertFalse(six.hasFactor(5));
  }

  @Test
  public void shouldKnowAllFactors(){
    Number six = new Number(6);
    assertEquals(asList(1, 2, 3, 6), six.getFactors());
  }
}
