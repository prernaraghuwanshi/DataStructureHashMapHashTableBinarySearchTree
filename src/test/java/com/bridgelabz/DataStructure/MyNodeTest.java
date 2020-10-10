package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.DataStructure.MyNode;

import junit.framework.Assert;

public class MyNodeTest {
	@Test
	public void givenThreeNumbers_whenLinked_shouldPassedLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(result);
	}
}
