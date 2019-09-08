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
}