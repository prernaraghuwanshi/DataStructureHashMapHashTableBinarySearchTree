package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void given3Numbers_whenAddedToBinarySearchTree_shouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);
	}

}
