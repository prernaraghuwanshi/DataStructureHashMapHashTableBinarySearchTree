package com.bridgelabz.DataStructure;

public class MyMapNode<K, V> implements INode<K> {
	private K key;
	private V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return this.next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = (MyMapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
