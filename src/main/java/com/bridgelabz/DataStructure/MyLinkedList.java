package com.bridgelabz.DataStructure;

public class MyLinkedList<K> {
	private INode<K> head;
	private INode<K> tail;

	public INode<K> getHead() {
		return head;
	}

	public void setHead(INode<K> head) {
		this.head = head;
	}

	public INode<K> getTail() {
		return tail;
	}

	public void setTail(INode<K> tail) {
		this.tail = tail;
	}

	// Constructor
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Function to add node to Linked List
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
