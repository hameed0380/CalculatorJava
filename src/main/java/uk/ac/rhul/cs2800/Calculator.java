package uk.ac.rhul.cs2800;

/**
 * This allows the calculation of string expressions.
 * 
 * @author hameed
 */
public interface Calculator {
  float evaluate(String what) throws InvalidExpressionException;

}
