package com.bridgelabz.DataStructure;

public class MyLinkedList<K> {
	private INode<K> head;
	private INode<K> tail;

	// Getter for Head
	public INode<K> getHead() {
		return head;
	}

	// Setter for Head
	public void setHead(INode<K> head) {
		this.head = head;
	}

	// Getter for Tail
	public INode<K> getTail() {
		return tail;
	}

	// Setter for Tail
	public void setTail(INode<K> tail) {
		this.tail = tail;
	}

	// Constructor
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Function to add node to Linked List (Add is at head)
	public void add(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// Function to append node to Linked List (Append is at tail)
	public void append(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}

	}

	// Function to insert node in between 2 nodes
	public void insert(INode<K> firstNode, INode<K> newNode) {
		INode<K> tempNode = firstNode.getNext();
		firstNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	// Function to delete first element
	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	// Function to delete last element
	public INode<K> popLast() {
		INode<K> tempNode = this.head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		tail.setNext(null);
		return tempNode;
	}

	// Function to print Linked List
	public void printLinkedList() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				myNodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
