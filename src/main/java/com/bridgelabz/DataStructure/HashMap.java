package com.bridgelabz.DataStructure;

public class HashMap<K, V> {
	MyLinkedList<K> myLinkedList;

	// Constructor
	public HashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	// Get value given Key
	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	// Add key-value pair
	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	// Display HashMap
	public void printHashMap() {
		StringBuffer print = new StringBuffer("{");
		MyMapNode<K, V> pointerNode = (MyMapNode<K, V>) myLinkedList.getHead();
		while (pointerNode.getNext() != null) {
			print.append(pointerNode.getKey() + "=" + pointerNode.getValue() + ", ");
			pointerNode = (MyMapNode<K, V>) pointerNode.getNext();
		}
		print.append(pointerNode.getKey() + "=" + pointerNode.getValue() + "}");
		System.out.println(print);
	}
}
