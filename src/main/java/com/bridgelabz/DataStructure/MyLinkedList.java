package com.bridgelabz.DataStructure;

public class MyLinkedList<K> {
	private INode<K> head;
	private INode<K> tail;
	private int size;

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
		this.size = 0;
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
		this.size += 1;
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
		this.size += 1;
	}

	// Function to insert node in between 2 nodes
	public void insert(INode<K> firstNode, INode<K> newNode) {
		INode<K> tempNode = firstNode.getNext();
		firstNode.setNext(newNode);
		newNode.setNext(tempNode);
		this.size += 1;
	}

	// Function to delete first element
	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		this.size -= 1;
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
		this.size -= 1;
		return tempNode;
	}

	// Function to search node given key
	public INode<K> search(K key) {
		INode<K> tempNode = this.head;
		while (!tempNode.getKey().equals(key)) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	// Function to search node with given key and then insert new node after
	public void insertAfterKey(K key, INode<K> newNode) {
		INode<K> tempNode = search(key);
		insert(tempNode, newNode);
	}

	// Function to delete node given its key
	public INode<K> delete(K key) {
		INode<K> deleteNode = search(key);
		INode<K> tempNode = this.head;
		while (!tempNode.getNext().equals(deleteNode)) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(deleteNode.getNext());
		this.size -= 1;
		return deleteNode;
	}

	// Function to find size of linked list
	public int size() {
		return this.size;
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
		System.out.println("Size: " + size());
	}
}
