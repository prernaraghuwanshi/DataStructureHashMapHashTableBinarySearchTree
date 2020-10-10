package com.bridgelabz.DataStructure;

public class Stack<K> {
	public MyLinkedList<K> linkedList;

	// Constructor
	public Stack() {
		linkedList = new MyLinkedList<K>();
	}

	// Push to stack
	public void push(INode<K> newNode) {
		linkedList.add(newNode);
	}

	// Display Stack
	public void viewStack() {
		linkedList.printLinkedList();
	}

}
