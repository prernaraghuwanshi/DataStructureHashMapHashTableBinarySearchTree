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
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub
		this.next = (MyMapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}
