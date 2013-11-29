package project_euler;

public class NumberList {
	Node first = null;
	Node current = null;

	NumberList (int number) {
		Node first = new Node(number);
		Node current = first;
	}
	public void first() {
		current = first;
	}
	
	/**
	 * 
	 * @return true if there is another node, false if there is not.
	 */
	public boolean next() {
		if ( current.getNext() != null ) {
			return false;
		} 
		else current = current.getNext();
		return true;
	}

	public void previous() {
		Node tempNodePointer = first;
		while (tempNodePointer.getNext() != current) {
			current = tempNodePointer;
		}
		tempNodePointer.setNext(current.getNext());
	}
	public void removeNode() {
		Node tempNodePointer = first;
		while (tempNodePointer.getNext() != current) {
			tempNodePointer = tempNodePointer.getNext();
		}
		tempNodePointer.setNext(current.getNext());
	}
	public void addNode() {
		//TODO implement this
	}
}
