// Generic LinkedList
class sLinkedList<T> {

	sllNode front;

	public class sllNode<T> {
		private T value;
		private sllNode next;

		public sllNode (T val) {
			value=val;
		}
	}

	// Insert a node at the front of a singly linked list
	public void addFirst(T val) {

		// make sure the first node isnt empty
		// if its empty then make this new value the first node
		if (front == null) {
			front = new sllNode<T>(val);
		} else {
			// create a new node with the value in the param
			sllNode<T> current = new sllNode<T>(val);
			// assign the first node to be the node after this new node
			current.next = front;
			// assign the first node variable to be this node
			front = current;
		}
	}
}