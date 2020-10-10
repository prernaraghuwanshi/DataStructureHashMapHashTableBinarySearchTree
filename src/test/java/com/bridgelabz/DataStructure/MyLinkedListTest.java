package com.bridgelabz.DataStructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3Numbers_whenAddedToLinkedList_shouldBeAddedToTop() {
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNode);
		//linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(myThirdNode) && linkedList.getHead().getNext().equals(mySecondNode)
				&& linkedList.getTail().equals(myFirstNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_whenAppendedToLinkedList_shouldBeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNode);
		//linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(myFirstNode) && linkedList.getHead().getNext().equals(mySecondNode)
				&& linkedList.getTail().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_whenInsertingSecondInBetween_shouldPassLinkedListCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNode);
		linkedList.insert(myFirstNode, mySecondNode);
		//linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(myFirstNode) && linkedList.getHead().getNext().equals(mySecondNode)
				&& linkedList.getTail().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_whenFirstElementDeleted_shouldPassLinkedListCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNode);
		linkedList.insert(myFirstNode, mySecondNode);
		linkedList.pop();
		//linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(mySecondNode) && linkedList.getTail().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_whenLastElementDeleted_shouldPassLinkedListCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNode);
		linkedList.insert(myFirstNode, mySecondNode);
		linkedList.popLast();
		//linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(myFirstNode) && linkedList.getTail().equals(mySecondNode);
		assertTrue(result);
	}

	@Test
	public void given3Numbers_whenSearchedFor30_shouldReturnSecondNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNode);
		linkedList.insert(myFirstNode, mySecondNode);
		INode<Integer> tempNode = linkedList.search(30);
		assertEquals(mySecondNode, tempNode);
	}

	@Test
	public void given3Numbers_whenInsertingBySearchingKey_shouldPassLinkedListCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNode);
		MyNode<Integer> myNewNode = new MyNode<>(40);
		linkedList.insertAfterKey(30, myNewNode);
		//linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(myFirstNode) && linkedList.getHead().getNext().equals(mySecondNode)
				&& linkedList.getHead().getNext().getNext().equals(myNewNode)
				&& linkedList.getTail().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void given4Numbers_whenDeletingBySearchingWithKey_shouldPassLinkedListCriteria() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNode);
		linkedList.append(myFourthNode);
		linkedList.delete(40);
		linkedList.printLinkedList();
		boolean result = linkedList.getHead().equals(myFirstNode) && linkedList.getHead().getNext().equals(mySecondNode)
				&& linkedList.getTail().equals(myFourthNode);
		assertTrue(result);
	}

}
