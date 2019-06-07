// Add a node after a value in a singly linked list
// give this method a target node to add the new node (made out of val) after
public void addAfter (sllNode<T> target, T val) {
	// if the given target null does not exist...
	if (target == null) {
		// ...then tell the user that it doesn't exist and exit the function
		System.out.println("The node you want to add after does not exist. Try again.");
		return;
	}

	// create a new node out of the new value with variable current
	sllNode<T> current = new sllNode<T>(val);
	// assign the node after the target node as the new node's next node
	current.next = target.next;
	// assign the new node to be the target node's next node
	target.next = current;
}