package com.bridgelabz.DataStructure;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode<K> next;

	// Constructor
	public MyNode(K key) {
		this.key = key;
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
	public INode<K> getNext() {
		return next;
	}

	// Setter for Next
	public void setNext(INode<K> next) {
		this.next = next;
	}
}
