package uk.ac.rhul.cs2800;

/**
 * This enum represents the symbols stored as entries.
 * 
 * @author hameed
 *
 */
public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("/"), PLUS("+"), MINUS("-"), INVALID(
      "?");

  private String sym;

  /**
   * sym variable stores the symbol as type of symbol.
   * 
   * @param sym variable stores the symbol.
   */
  private Symbol(String sym) {
    this.sym = sym;
  }

  public String toString() {
    return this.sym;
  }

}

