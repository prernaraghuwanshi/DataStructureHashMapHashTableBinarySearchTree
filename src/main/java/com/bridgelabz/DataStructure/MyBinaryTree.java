package com.bridgelabz.DataStructure;

public class MyBinaryTree<K extends Comparable<K>> {
	MyBinaryNode<K> root;

	// Add node to BST
	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	// Recursive add function
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}

	// Get Size of BST
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	// Recursive Size function
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
	}

	// Search function
	public boolean search(K key) {
		return searchRecursive(root, key) == null ? false : true;
	}

	// Recursive Search function
	private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
		if (current == null)
			return null;
		else if (current.key.compareTo(key) == 0)
			return current;
		else if (current.key.compareTo(key) < 0)
			return searchRecursive(current.right, key);
		else
			return searchRecursive(current.left, key);
	}

}
