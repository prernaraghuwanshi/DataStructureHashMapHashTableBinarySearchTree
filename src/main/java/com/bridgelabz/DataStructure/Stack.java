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

	// Peek stack
	public INode<K> peek() {
		return linkedList.getHead();
	}

	// Pop from stack
	public INode<K> pop() {
		if (linkedList.size() > 0)
			return linkedList.pop();
		else {
			System.out.println("Stack is empty!");
			return null;
		}
	}

	// Display Stack
	public void viewStack() {
		linkedList.printLinkedList();
	}

}
