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
}