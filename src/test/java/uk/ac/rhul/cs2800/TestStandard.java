package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStandard {



  private StandardCalc calc;

  @BeforeEach
  void setUp() throws Exception {
    this.calc  = new StandardCalc();
  }
  
  
  
  
  @Test
  public final void testEmpty() throws InvalidExpressionException {
      this.calc.evaluate("");
  }


}
