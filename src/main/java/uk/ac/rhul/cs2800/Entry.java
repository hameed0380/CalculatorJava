package uk.ac.rhul.cs2800;

/**
 * This class represents the values stored in stack.
 * 
 * @author hameed
 *
 */
public class Entry {
  private float number;
  private String str;
  private Symbol other;
  private Type type;

  /**
   * This constructor initialises the object of the class.
   * 
   * @param number stores the number element created.
   */
  Entry(float value) {
    this.type = Type.NUMBER;
    this.number = value;
  }

  /**
   * This constructor initialises the object of the class.
   * 
   * @param other stores the other type element created.
   */
  Entry(Symbol other) {
    this.type = Type.SYMBOL;
    this.other = other;
  }


  /**
   * This is a constructor to initialise the object of the class.
   * 
   * @param string stores the string variable.
   */
  public Entry(String string) {
    this.type = Type.STRING;
    this.str = string;
  }

  /**
   * This is a getter method to get the type and return it.
   * 
   * @return the type of the element.
   */
  public Type getType() {
    return this.type;
  }


  /**
   * This is a method to get the string and test the correct type is entered.
   * 
   * @return The string type element is returned.
   * @throws BadTypeException
   * 
   * @throws BadTypeException If the wrong type is entered then an exception is thrown.
   */
  public String getString() throws BadTypeException {
    if (this.type != Type.STRING) {
      throw new BadTypeException("Incorrect type was entered");
    }
    return this.str;
  }

  /**
   * This is a method to get the symbol element and test that the correct type was entered.
   * 
   * @return The symbol type element is returned through the variable other.
   * 
   * @throws BadTypeException If the wrong type is entered then an exception is thrown.
   */
  public Symbol getSymbol() throws BadTypeException {
    if (this.type != Type.SYMBOL) {
      throw new BadTypeException("Incorrect type was entered");
    }
    return this.other;
  }

  /**
   * This is a getter method used to get the number element and test if it is a float type.
   * 
   * @return The number element is returned through the number variable.
   * 
   * @throws BadTypeException If the wrong type is entered then an exception is thrown.
   */
  public float getValue() throws BadTypeException {
    if (this.type != Type.NUMBER) {
      throw new BadTypeException("Incorrect type was entered");
    }
    return this.number;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(number);
    result = prime * result + ((other == null) ? 0 : other.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    if (Float.floatToIntBits(number) != Float.floatToIntBits(other.number)) {
      return false;
    }
    if (this.other != other.other) {
      return false;
    }
    if (type != other.type) {
      return false;
    }
    return true;
  }



}
