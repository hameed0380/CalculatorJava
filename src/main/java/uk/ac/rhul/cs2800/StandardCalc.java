package uk.ac.rhul.cs2800;

/**
 * Evaluates infinix expressions.
 * 
 * @author hameed
 *
 */
public class StandardCalc implements Calculator {
  private RevPolishCalc rpCalc = new RevPolishCalc();
  private OpStack values = null;
  private StrStack stStack = null;


  public float evaluate(String what) throws InvalidExpressionException {
    return 0;
   

  }

}
