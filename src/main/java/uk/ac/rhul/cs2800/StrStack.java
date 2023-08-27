package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This class represents the StrStack.
 * 
 * @author hameed
 *
 */
public class StrStack {

  /**
   * Field of type stack item called strStack.
   */
  private Stack strStack = new Stack();

  /**
   * Empty Constructor for additional constructors with arguments.
   */
  public StrStack() {}

  /**
   * Determines whether the stack is empty.
   * 
   * @return strStack is equal to null meaning strStack is empty
   */
  public boolean isEmpty() {
    return this.strStack == null;
  }

  /**
   * This method adds a new entry to the stack.
   * 
   * @param str passes through the string variable which is then wrapped into entry.
   */
  public void push(String str) {
    this.strStack.push(new Entry(str));
  }

  /**
   * If the wrong type is entered then an exception is thrown.
   * 
   * @return Currently returns the the value popped.
   * 
   * @throws EmptyStackException thrown to indicate that the stack is empty.
   * 
   * @throws BadTypeException If the wrong type is entered then an exception is thrown.
   */
  public String pop() throws EmptyStackException, BadTypeException {
    return this.strStack.pop().getString();
  }



}
