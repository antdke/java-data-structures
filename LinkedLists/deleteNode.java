// delete a node of given position in a singly linked list
public void deleteNode(int position) {

	// if the first node doesnt exist...
	if (front == null)
		// ...then exit the method
		return;

	// store first node
	sllNode<T> current = front;

	// position 0 removes the first node
	// if position 0 is given...
	if (position == 0) {
		// ...then the 2nd node is made the first node
		// 		and the original first node is unlinked
		front = current.next;
		// exit the method
		return;
	}

	// Grab the node that's before the one that's to be deleted
	for (int i=0; temp!=null && i<position-1; i++)
		// put the node that's before into temp variable
		temp = temp.next;

	// Make sure the node grabbed and the one after (the one you want)isnt out of bounds
	if (temp == null || temp.next == null) {
		return;
	}

	// unlink the node you want by linking the node before it
	// 		with the node after it.
	temp.next = temp.next.next;
}