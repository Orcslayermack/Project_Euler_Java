package project_euler;

public class Node {
	// Node Data
	private long number;
	protected Node next;
	
	// Constructors
	Node (long number) {
		setNumber(number);
		setNext(null);
	}
	
	// Getters and Setters
	public Node getNext() {
		return next;
	}
	public void setNext(Node node) {
		next = node;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void printNumber(){
		System.out.println(number);
	}
}