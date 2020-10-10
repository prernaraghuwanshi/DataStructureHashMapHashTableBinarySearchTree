package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {

	@Test
	public void given3Numbers_whenPushedToStack_shouldPassStackCriteria() {
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFirstNode = new MyNode<>(70);

		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.viewStack();
		boolean result = myStack.linkedList.getHead().equals(myThirdNode)
				&& myStack.linkedList.getHead().getNext().equals(mySecondNode)
				&& myStack.linkedList.getTail().equals(myFirstNode);

		assertTrue(result);
	}

}
