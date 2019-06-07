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

	// Insert a node to the back of a singly Linked list
	public void addLast(T val) {

		// if the first node is empty...
		if (front == null) {
			// ...create the first node with the new value
			front = new sllNode<T>(val);
		} else {
			// variable current is given the first node value
			sllNode<T> current = front;
			// while the node after current isnt empty...
			while (current.next != null) {
				// the current variable is given the next node's value
				// TRAVERSING A LINKED LIST
				current=current.next;
			}
			// once there is no next node for the current variable to given a value
			// the next node after current, the empty node, is give the new value
			current.next = new sllNode<T>(val);
		}
	}
}