package com.bridgelabz.DataStructure;

public class MyNode<K> {
	private K key;
	private MyNode next;

	// Constructor
	public MyNode(K key) {
		this.key = null;
		this.next = null;
	}

	// Getter for Key
	public K getKey() {
		return key;
	}

	// Setter for Key
	public void setKey(K key) {
		this.key = key;
	}

	// Getter for Next
	public MyNode getNext() {
		return next;
	}

	// Setter for Next
	public void setNext(MyNode next) {
		this.next = next;
	}
}
