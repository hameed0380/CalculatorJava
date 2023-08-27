package uk.ac.rhul.cs2800;

/**
 * If the wrong expression is entered then an exception is thrown.
 * 
 * @author hameed
 *
 */
public class InvalidExpressionException extends Exception {

  /**
   * This is thrown when the string representation of an expression is invalid.
   */
  private static final long serialVersionUID = -9001860817336438137L;


  /**
   * This method constructs an InvalidExpressionException with given string.
   * 
   * @param string an exception message.
   */
  public InvalidExpressionException(String string) {
    super(string);
  }

}
