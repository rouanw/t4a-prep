package prep;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClassifierTest {

  @Test
  public void oneHasTheFactorsOne() throws Exception {
    List<Integer> factors = new Classifier(1).factors();
    assertEquals(Arrays.asList(1), factors);
  }

  @Test
  public void testFactorsKnowsFactorsOfSix() throws Exception {
    List<Integer> factors = new Classifier(6).factors();
    assertEquals(Arrays.asList(1, 2, 3, 6), factors);
  }
}
