package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest {
	MyBinaryTree<Integer> myBinaryTreeLarge;

	@Before
	public void initializeLargerTree() {
		myBinaryTreeLarge = new MyBinaryTree<Integer>();
		myBinaryTreeLarge.add(56);
		myBinaryTreeLarge.add(30);
		myBinaryTreeLarge.add(70);
		myBinaryTreeLarge.add(22);
		myBinaryTreeLarge.add(40);
		myBinaryTreeLarge.add(60);
		myBinaryTreeLarge.add(95);
		myBinaryTreeLarge.add(11);
		myBinaryTreeLarge.add(65);
		myBinaryTreeLarge.add(3);
		myBinaryTreeLarge.add(16);
		myBinaryTreeLarge.add(63);
		myBinaryTreeLarge.add(67);
	}

	@Test
	public void given3Numbers_whenAddedToBinarySearchTree_shouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);
	}

	@Test
	public void given13Numbers_whenAddedToBinarySearchTree_shouldReturnSizeThirteen() {
		int size = myBinaryTreeLarge.getSize();
		assertEquals(13, size);
	}

	@Test
	public void givenBinarySearchTree_when63Searched_shouldReturnTrue() {
		assertTrue(myBinaryTreeLarge.search(63));
	}

}
