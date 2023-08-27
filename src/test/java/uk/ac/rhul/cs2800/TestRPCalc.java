package uk.ac.rhul.cs2800;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Junit test case for the reverse polish class
 * 
 * @author hameed
 *
 */
class TestRPCalc {


  private Calculator calc;

  @BeforeEach
  void setUp() throws Exception {
    this.calc = new RevPolishCalc();
  }

  // Testing for an empty value
  @Test
  public void testEmpty() throws InvalidExpressionException {
    this.calc.evaluate("");
  }

  // Testing when an integer is being used
  @Test
  public final void justZero() throws InvalidExpressionException {
    assertEquals("Testing an integer", 0.0F, this.calc.evaluate("0"), 0.001F);
  }

  // Testing for the same number
  @Test
  public void testsameNumber() throws InvalidExpressionException {
    float number = 0;
    String numberStr = String.valueOf(number);
    assertEquals("Testing an integer", number, this.calc.evaluate(numberStr), 0.001F);
  }



}
