// Locate a node within a LinkedList by value
public sllNode<T> locate (T val) {

	// assign a variable the first node
	sllNode<T> current = front;

	// while the first node exists...
	while (current != null) {
		// ...if the value of the current node equates
		// 		to the value that we're looking for...
		if (current.value == val) {
			//...then return the value of the current node
			return current;
		} else {
			// ...else, assign the next node to be the current variable
			//    and restart loop.
			current = current.next;
		}
	}
	
	// return null if the value isn't found
	return null;
}