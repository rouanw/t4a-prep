package prep;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
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

  @Test
  public void testKnowsTheFactorsOfANumber() throws Exception {
    Set<Integer> actualFactors = new Classifier(16).factors();
    Set<Integer> expectedFactors = new HashSet<Integer>(Arrays.asList(1, 2, 4, 8, 16));
    assertEquals(expectedFactors, actualFactors);
  }

  @Test
  public void testKnowsNotAllNumbersHaveTheSameFactors() throws Exception {
    Set<Integer> factorsOne = new Classifier(16).factors();
    Set<Integer> factorsTwo = new Classifier(5).factors();
    assertThat(factorsOne, not(equalTo(factorsTwo)));
  }
}
