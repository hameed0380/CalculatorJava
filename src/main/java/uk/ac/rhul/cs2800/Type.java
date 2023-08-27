package uk.ac.rhul.cs2800;

/**
 * This enum represents the type stored as entries.
 * 
 * @author hameed
 *
 */
public enum Type {
  NUMBER, SYMBOL, STRING, INVALID,;

  private String type;

  private Type() {

  }

  /**
   * Type variable stores the type of entry as string.
   * 
   * @param type variable stores the type.
   */
  private Type(String type) {
    this.type = type;
  }

  public String toString() {
    return this.type;
  }

}
