package uk.ac.rhul.cs2800;



import java.util.EmptyStackException;

/**
 * This class represents a stack value of entry values.
 * 
 * @author hameed
 *
 */
public class Stack {


  int size = 0;
  Entry[] entries;

  /**
   * Used to be able to store a entry into stack.
   * 
   */
  Stack() {
    this.entries = new Entry[1];

  }

  /**
   * Get the number of entries in this stack.
   * 
   * @return The number entries in the stack.
   */
  public int size() {
    return this.size;
  }


  /**
   * This method adds a new entry to stack and increase the size of the stack using a temp list.
   * 
   * @param i pass through the entry variable of type entry
   */
  public void push(Entry i) {
    int len = entries.length;
    // when size and length are the same create a new entry array set to double the
    // orginal entrys length
    if (this.size == len) {
      Entry[] temp = new Entry[len * 2];
      for (int n = 0; n < len; n++) {
        temp[n] = entries[n];
      }
      entries = temp;
    }
    entries[this.size++] = i;
  }



  /**
   * This method gives the newest element and removes the newest entry.
   * 
   * @return Currently returns the entry.
   */
  public Entry pop() {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    this.size--;
    return entries[this.size];
  }

  /**
   * This method checks if the stack is empty and if not returns newest entry.
   * 
   * @return Returns the newest entry in the stack.
   */
  public Entry top() {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    return entries[this.size - 1];
  }


}
