package com.bridgelabz.DataStructure;

public class Queue<K> {
	public MyLinkedList<K> linkedList;

	// Constructor
	public Queue() {
		linkedList = new MyLinkedList<K>();
	}

	// Enqueue operation
	public void enqueue(INode<K> newNode) {
		linkedList.append(newNode);
	}

	// Dequeue operation
	public INode<K> dequeue() {
		return linkedList.pop();
	}

	// Display Queue
	public void viewQueue() {
		linkedList.printLinkedList();
	}
}
