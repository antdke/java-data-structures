// A method to insert a node to the back of a singly Linked list
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