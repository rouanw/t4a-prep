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

  @Test
  public void testCanSumUpFactors(){
    assertEquals(1 + 2 + 3 + 6, new Classifier(6).sumFactors());
  }

  @Test
  public void testTwoSumsAreDifferent() throws Exception {
    int firstSum = new Classifier(6).sumFactors();
    int secondSum = new Classifier(5).sumFactors();
    assertThat(firstSum, not(equalTo(secondSum)));
  }

  @Test
  public void testCanDeterminePerfectNumber() throws Exception {
    assertTrue("Six is not a perfect number but should be", new Classifier(6).isPerfectNumber());
  }

  @Test
  public void testCanRecogniseANonPerfectNumber() throws Exception {
    assertFalse("Five is a perfect number, but should not be", new Classifier(5).isPerfectNumber());
  }
}
