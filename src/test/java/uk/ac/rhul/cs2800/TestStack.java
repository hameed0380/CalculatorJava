package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.AfterClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit class for testing the Stack class.
 * 
 * @author hameed
 *
 */
class TestStack {

  private Stack first;

  @BeforeEach
  public void setup() {
    this.first = new Stack();
  }

  @AfterClass
  public static void tearDownClass() {}


  @Test
  public void test() {
    Stack first = new Stack();
  }

  @Test
  public void testSize() {
    Stack first = new Stack();
    assertEquals(this.first.size(), 0,
        "Test a newly created stack to see that it has the size of zero.");
  }

  @Test
  public void testpush() {
    this.first.push(new Entry(3));
    assertEquals(this.first.size(), 1, "Test to see if an element has been added to the stack.");
  }

  @Test
  public void testPop() {
    this.first.push(new Entry(3));
    assertEquals(this.first.pop(), new Entry(3),
        "Pushing a three then popping it should return 3.");
  }

  @Test
  public void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> this.first.pop(),
        "Stack is empty so you cannot pop item so should throw exception.");
  }


  @Test
  public void pushThenPop() {
    this.first.push(new Entry(3));
    assertEquals(this.first.pop(), new Entry(3),
        "Pushing a three then popping it should return 3.");
    assertEquals(this.first.size, 0, "Pushing a three then popping it should give an empty stack.");
    assertThrows(EmptyStackException.class, () -> this.first.pop(),
        "Push then pop and pop again should throw an exception.");
  }


  @Test
  void push3times() {
    this.first.push(new Entry(5));
    this.first.push(new Entry(10));
    this.first.push(new Entry(15));
    assertEquals(this.first.size, 3, "Pushing three times should give size 3.");
    assertEquals(this.first.pop(), new Entry(15),
        "Pushing three times then popping should return  the third item pushed.");
    assertEquals(this.first.pop(), new Entry(10),
        "Pushing three times then popping should return  the second item pushed.");
    assertEquals(this.first.pop(), new Entry(5),
        "Pushing three times then popping should return  the first item pushed.");
    assertEquals(this.first.size, 0,
        "Pushing three times then popping three times should result in an empty stack");
    assertThrows(EmptyStackException.class, () -> this.first.pop(),
        "Push, pop, pop should throw an exception");
  }

  @Test
  public void testTop() {
    this.first.push(new Entry(1));
    assertEquals(this.first.top(), new Entry(1), "Returns the newest entry which should be 1");
  }



}
