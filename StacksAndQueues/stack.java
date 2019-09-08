public class Stack {
  private static class Node {
    private int data;
    private Node next;

    private Node(int data) {
      this.data = data;
    }
  }

  // with stacks, we add and remove from the end (the top of a stack of books -
  // LIFO)
  private Node top;

  // check if stack has any nodes
  public boolean isEmpty() {
    return top == null;
  }

  // return the data in the top node
  public int peek() {
    if (top != null) {
      return top.data;
    }
  }

  // adds a node to the stack by pushing it on top of the stack (putting an extra
  // book on top of the books)
  public void push(int data) {
    // create a node from the provided data
    Node node = new Node(data);
    // check if a top node exists before adding
    if (top != null) {
      // point the new node to the top of the stack
      node.next = top;
    }
    // assign the new node as the top node
    top = node;
  }

}