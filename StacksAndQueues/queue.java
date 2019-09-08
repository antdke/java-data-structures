public static class Queue {
  // An inner class to represent the Node
  private static class Node {
    // pointer or var that represents the data
    private int data;
    // each node needs a pointer to the next node
    private Node next;

    // a constructor to create a node
    private Node(int data) {
      this.data = data;
    }
  }

  private Node head; // remove from the head (front of the line)
  private Node tail; // add to the back of the line

  // checks if there is "no one on the line"
  public boolean isEmpty() {
    // if head is empty return true. if not, false
    return head == null;
  }

  // returns the data in head node
  public int peek() {
    return head.data;
  }

  // adds to the tail (back of the line)
  public void add(int data) {
    // create a new data with the provided data
    Node node = new Node(data);
    // checks if there is a "last person on line" (more than 1 node)
    if (tail != null) {
      // if there are more than 1 node, then point the last node to the newly created
      // node
      tail.next = node;
    }
    // make the new node the new tail of the Queue
    tail = node;
  }

}