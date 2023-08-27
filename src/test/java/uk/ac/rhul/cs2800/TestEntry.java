package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class TestEntry {
  private Entry entry;


  @Test
  public void test() {
    Entry entry = new Entry(0);
  }

  // Testing for the constructors
  @Test
  public void testTypeSymbol() throws BadTypeException {
    Entry entry1 = new Entry(Symbol.INVALID);
    assertTrue(entry1.getSymbol() == Symbol.INVALID,
        "Create new entry to see if it matches symbol.");
  }

  @Test
  public void testTypeFloat() throws BadTypeException {
    Entry entry2 = new Entry(5);
    assertTrue(entry2.getValue() == 5, "Create new entry with float value and check equivalents.");
  }

  @Test
  public void testType() {
    Entry entry3 = new Entry(5);
    assertTrue(entry3.getType() == Type.NUMBER,
        "Test a newly created entry to see that it matches the correct type.");
  }

  // test for the get methods
  @Test
  public void testGetString() throws BadTypeException {
    Entry entry4 = new Entry("string test");
    assertEquals("string test", entry4.getString(),
        "Create new entry with string value and test if they match.");
  }

  @Test
  public void testGetSymbol() throws BadTypeException {
    Entry entry5 = new Entry(Symbol.INVALID);
    assertEquals(Symbol.INVALID, entry5.getSymbol(),
        "Create new entry with symbol value to check that it retrieves the correct value.");
  }

  @Test
  public void testGetValue() throws BadTypeException {
    Entry entry6 = new Entry(12);
    assertEquals(12, entry6.getValue(),
        "Create new entry with float number value to check that it retrieves the correct value.");
  }

  // test for hashcode and .equals methods
  @Test
  public void testEquals_Symmetric() {
    Entry x = new Entry("test symmetrical");
    Entry y = new Entry("test symmetrical");
    assertTrue(x.equals(y) && y.equals(x), "Equals check name field value");
    assertTrue(x.hashCode() == y.hashCode(), "hashcode check name field value");
  }

}
