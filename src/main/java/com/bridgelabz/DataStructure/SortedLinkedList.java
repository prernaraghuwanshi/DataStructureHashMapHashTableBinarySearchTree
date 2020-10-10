package com.bridgelabz.DataStructure;

public class SortedLinkedList<K extends Comparable> {
	private INode<K> head;
	private INode<K> tail;
	private int size;

	public INode<K> getHead() {
		return head;
	}

	public void setHead(INode<K> head) {
		this.head = head;
	}

	public INode<K> getTail() {
		return tail;
	}

	public void setTail(INode<K> tail) {
		this.tail = tail;
	}

	// Constructor
	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else if (head == tail) {
			if (head.getKey().compareTo(newNode.getKey()) == 1) {
				INode<K> tempNode = this.head;
				this.head = newNode;
				this.head.setNext(tempNode);
			} else if (head.getKey().compareTo(newNode.getKey()) == -1) {
				this.tail.setNext(newNode);
				this.tail = newNode;
			}
		} else {
			INode<K> firstNode = head;
			INode<K> secondNode = head.getNext();
			while (secondNode != null) {
				if (firstNode.getKey().compareTo(newNode.getKey()) == -1
						&& secondNode.getKey().compareTo(newNode.getKey()) == 1) {
					firstNode.setNext(newNode);
					newNode.setNext(secondNode);
					break;
				}
				firstNode = firstNode.getNext();
				secondNode = secondNode.getNext();
				if (firstNode == tail) {
					tail.setNext(newNode);
					tail = newNode;
				}
			}
		}
		size += 1;
	}

	// Function to print Linked List
	public void printLinkedList() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				myNodes.append("->");
			}
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
		System.out.println("Size: " + size);
	}

}
