package project_euler;

public class NumberList {
	// Node Pointers
	protected Node first = null;
	protected Node current = null;

	// Constructors
	NumberList (int number) {
		first = new Node(number);
		first();
	}

	NumberList (Node node) {
		first = node;
		first();
	}

	/**
	 * 
	 * @return true if the last Node is selected or if the list is empty.
	 */
	public boolean isLast() {
		if ( isEmpty() ) {
			return true;
		}
		if ( current.getNext() == null ) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Moves on to the next Node.
	 */
	public void next() {
		if ( isEmpty() ) {
			return;
		}
		else if ( isLast()) {
			first();
		}
		else current = current.getNext();
	}

	/**
	 * Moves to the previous Node.
	 */
	public void previous() {
		if ( isEmpty() ) {
			return;
		}
		else if (current == first && current.getNext() == null ) {
			return;
		}
		else if (current == first && current.getNext() != null ) {
			while ( current.getNext() != null ) {
				next();
			}
		}
		else {
			Node tempNodePointer = current;
			first();
			while (current.getNext() != tempNodePointer) {
				next();
			}
		}	
	}

	/**
	 * Removes the current Node.
	 */
	public void removeNode() {
		if ( isEmpty() ) {
			return;
		}
		else if ( current == first ) {
			next();
			first.setNext(null);
			// this is correct, we are changing the "first" pointer, not moving the current pointer.
			// I'm not sure I need to do this though since i'm removing the pointer to the first.
			//TODO see if I can just remove the pointer to the first Node.
			first = current;
		}
		else {
			Node tempNodePointer = current;
			previous();
			current.setNext(tempNodePointer.getNext());
		}
	}

	/**
	 * Adds a Node after the current Node.
	 * @param node
	 */
	public void addNode(Node node) {
		if ( isEmpty() == true ) {
			first = node;
			first();
		}
		else if ( isLast() ) {
			current.setNext(node);
		}
		else {
			Node tempNodePointer = current.getNext();
			current.setNext(node);
			next();
			current.setNext(tempNodePointer);
		}
	}

	/**
	 * moves pointer to the first node.
	 */
	public void first() {
		current = first;
	}

	/**
	 * 
	 * @param numList
	 * @return largest int contained in the num list.
	 */
	public int largestInt(NumberList numList) {
		int largest = 0;
		if ( isEmpty() == true ) {
			//TODO see if these returns are really needed
			//return 0;
		}
		else {
			first();
			//TODO this will currently not run if there is only 1 node in the list. fix it.
			while ( isLast() == false ) {
				if ( current.getNumber() > largest ) {
					largest = current.getNumber();
				}
				next();
			}
			//return largest;
		}
		return largest;
	}

	/**
	 * 
	 * @return true if the list is empty.
	 */
	public boolean isEmpty() {
		if ( first == null && current == null ) {
			return true;
		}
		else { 
			return false;
		}
	}


}
