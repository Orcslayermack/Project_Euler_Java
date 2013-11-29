package project_euler;

public class Node {
	// Node Data
	private int number;
	protected Node next;
	
	// Constructors
	Node (int number) {
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void printNumber(){
		System.out.println(number);
	}
}