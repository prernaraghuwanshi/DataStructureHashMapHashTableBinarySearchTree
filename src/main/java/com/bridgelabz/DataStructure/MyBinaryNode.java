package com.bridgelabz.DataStructure;

public class MyBinaryNode<K extends Comparable<K>>{
	K key;
	MyBinaryNode<K> right;
	MyBinaryNode<K> left;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

}
