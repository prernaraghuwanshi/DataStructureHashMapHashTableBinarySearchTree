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

	// Display Queue
	public void viewQueue() {
		linkedList.printLinkedList();
	}
}
