package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassifierTest {
  @Test
  public void testKnowsIfANumberIsAFactor() throws Exception {
    assertTrue(new Classifier(6).hasFactor(2));
  }

  @Test
  public void testKnowsWhenANumberIsNotAFactor() throws Exception {
    assertFalse(new Classifier(7).hasFactor(2));
  }
}
