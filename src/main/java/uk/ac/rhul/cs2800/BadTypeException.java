package uk.ac.rhul.cs2800;

/**
 * If the wrong type is entered then an exception is thrown.
 * 
 * @author hameed
 *
 */
public class BadTypeException extends Exception {

  /**
   * This is the serialVersionUID generated for the BadTypeException.
   * 
   */
  private static final long serialVersionUID = 902259016746188985L;

  /**
   * This method constructs an InvalidExpressionException with given string.
   * 
   * @param string an exception message.
   */
  public BadTypeException(String string) {
    super(string);
  }

}
