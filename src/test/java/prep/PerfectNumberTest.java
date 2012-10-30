package prep;

import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectNumberTest {

  @Test
  public void shouldKnowIfANumberIsAFactor(){
    PerfectNumber six = new PerfectNumber(6);
    assertTrue(six.hasFactor(1));
    assertFalse(six.hasFactor(5));
  }

}
