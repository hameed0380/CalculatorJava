package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit class for testing the StrStack class.
 * 
 * @author hameed
 *
 */
class TestStrStack {



  @BeforeEach
  void setUp() throws Exception {
    StrStack ss = new StrStack();
  }

  @Test
  void testStringStack() {
    StrStack stack = new StrStack();
    assertTrue(stack.toString() != null, "test an object can be created with string");
  }

  @Test
  public void isEmptyTest() {
    StrStack stack = new StrStack();
    assertFalse(stack.isEmpty(), "Test to check for empty stack in the StrStack class.");
  }

  @Test
  public void testpush() {
    StrStack stack = new StrStack();
    stack.push("test");
    assertEquals(stack.isEmpty(), false, "Test to see if an element has been added to the stack.");
  }

  @Test
  public void testPop() throws EmptyStackException, BadTypeException {
    StrStack stack = new StrStack();
    stack.push("test2");
    assertEquals(stack.pop(), "test2", "Pushing string test2 then popping it should return test2.");
  }

  @Test
  public void testEmptyPop() {
    StrStack stack = new StrStack();
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "Stack is empty so you cannot pop item so should throw exception.");
  }

  @Test
  public void pushThenPop() throws EmptyStackException, BadTypeException {
    StrStack stack = new StrStack();
    stack.push("test3");
    assertEquals(stack.pop(), "test3", "Pushing a three then popping it should return test3.");
    assertEquals(stack.isEmpty(), false,
        "Pushing the string test3 then popping it should give an empty stack.");
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "Push then pop and pop again should throw an exception.");
  }

  @Test
  void push3times() throws EmptyStackException, BadTypeException {
    StrStack stack = new StrStack();
    stack.push("1");
    stack.push("2");
    stack.push("3");
    assertEquals(stack.pop(), "3",
        "Pushing three times then popping should return  the third item pushed.");
    assertEquals(stack.pop(), "2",
        "Pushing three times then popping should return  the second item pushed.");
    assertEquals(stack.pop(), "1",
        "Pushing three times then popping should return  the first item pushed.");
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "Push, pop, pop should throw an exception");
  }



}
