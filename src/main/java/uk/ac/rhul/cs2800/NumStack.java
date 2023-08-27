package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This class represents the NumStack.
 * 
 * @author hameed
 *
 */
public class NumStack {


  /**
   * Field of type stack item called numStack.
   */
  private Stack numStack = new Stack();

  /**
   * Empty Constructor for additional constructors with arguments.
   */
  public NumStack() {}


  /**
   * Determines whether the stack is empty.
   * 
   * @return numStack is equal to null meaning numStack is empty.
   */
  public boolean isEmpty() {
    return this.numStack == null;
  }


  /**
   * This method adds a new entry to the stack.
   * 
   * @param i pass through the float variable which is then wrapped into entry.
   */
  public void push(float i) {
    this.numStack.push(new Entry(i));
  }


  /**
   * This method gives the newest element and removes the newest entry.
   * 
   * @return Currently returns the the value popped.
   * 
   * @throws EmptyStackException thrown to indicate that the stack is empty.
   * 
   * @throws BadTypeException If the wrong type is entered then an exception is thrown.
   */
  public float pop() throws EmptyStackException, BadTypeException {
    return this.numStack.pop().getValue();
  }



}
