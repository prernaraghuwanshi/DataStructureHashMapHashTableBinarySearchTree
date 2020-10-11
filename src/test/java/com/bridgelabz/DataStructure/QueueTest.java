package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueTest {

	@Test
	public void given3Numbers_whenEnqueued_shouldPassQueueCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		Queue<Integer> myQueue = new Queue<Integer>();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.viewQueue();
		boolean result = myQueue.linkedList.getHead().equals(myFirstNode)
				&& myQueue.linkedList.getHead().getNext().equals(mySecondNode)
				&& myQueue.linkedList.getTail().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_whenDequeued_shouldPassQueueCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		Queue<Integer> myQueue = new Queue<Integer>();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.dequeue();
		myQueue.viewQueue();
		boolean result = myQueue.linkedList.getHead().equals(mySecondNode)
				&& myQueue.linkedList.getTail().equals(myThirdNode);
		assertTrue(result);
	}
}
