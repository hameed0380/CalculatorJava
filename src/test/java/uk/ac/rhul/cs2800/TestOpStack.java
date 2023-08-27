package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit class for testing the OpStack class.
 * 
 * @author hameed
 *
 */
class TestOpStack {

  private OpStack opstack;

  @BeforeEach
  void setUp() throws Exception {
    opstack = new OpStack();
  }

  @Test
  public void isEmptyTest() {
    opstack = new OpStack();
    assertFalse(opstack.isEmpty(), "Test to check for empty stack in the OpStack class.");
  }

  @Test
  public void testpush() {
    OpStack test = new OpStack();
    test.push(Symbol.TIMES);
    assertEquals(test.isEmpty(), false, "Test to see if an element has been added to the stack.");
  }

  @Test
  public void testPop() throws EmptyStackException, BadTypeException {
    this.opstack.push(Symbol.TIMES);
    assertEquals(this.opstack.pop(), Symbol.TIMES,
        "Pushing the symbol times then popping it should return times.");
  }

  @Test
  public void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> this.opstack.pop(),
        "Stack is empty so you cannot pop item so should throw exception.");
  }



}
