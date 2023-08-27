package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit class for testing the Stack class.
 * 
 * @author hameed
 *
 */
class TestNumStack {


  private NumStack ns;

  @BeforeEach
  public void setup() {
    ns = new NumStack();
  }

  @Test
  public void isEmptyTest() {
    NumStack stack = new NumStack();
    assertFalse(stack.isEmpty(), "Test to check for empty stack in the NumStack class.");
  }

  @Test
  public void testpush() {
    ns.push(5);
    assertEquals(ns.isEmpty(), false, "Test to see if an element has been added to the stack.");
  }

  @Test
  public void isEmptyTest1() {
    NumStack nonEmptyStack = new NumStack();
    nonEmptyStack.push(1);
    assertFalse(nonEmptyStack.isEmpty(),
        "Test to see if the stack is empty when an item has been push on");
  }

  @Test
  public void testPop() throws EmptyStackException, BadTypeException {
    this.ns.push(3);
    assertEquals(this.ns.pop(), 3, "Pushing a three then popping it should return 3.");
  }

  @Test
  public void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> this.ns.pop(),
        "Stack is empty so you cannot pop item so should throw exception.");
  }

  @Test
  public void pushThenPop() throws EmptyStackException, BadTypeException {
    ns.push(3);
    assertEquals(ns.pop(), 3, "Pushing a three then popping it should return 3.");
    assertEquals(ns.isEmpty(), false, "Pushing the 3 then popping it should give an empty stack.");
    assertThrows(EmptyStackException.class, () -> ns.pop(),
        "Push then pop and pop again should throw an exception.");
  }



}
