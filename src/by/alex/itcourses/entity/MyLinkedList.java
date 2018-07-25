package by.alex.itcourses.entity;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

	private Node<T> head;
	private Node<T> tail;
	private Node<T> current;

	private int count = 0;

	public void addNodeHead(T obj) {
		Node<T> node = new Node<>(obj);
		if (head == null) {
			tail = node;
			head = node;
			count++;
		} else {

			head.setNext(node);
			node.setPrev(head);
			head = node;
			count++;
		}
	}

	public void addNodeTail(T obj) {
		Node<T> node = new Node<>(obj);
		if (tail == null) {
			tail = node;
			head = node;
			count++;
		} else {
			tail.setPrev(node);
			node.setNext(tail);
			tail = node;
			count++;
		}
	}

	public void addNodeToPosistion(int index, T obj) {
		int localCount = 0;
		Node<T> node = new Node<>(obj);
		current = tail;
		if (index > count) {
			throw new IllegalArgumentException("List lenght less then index");
		} else {
			while (localCount < index - 1) {
				current = current.getNext();
				System.out.println(current.getObj());
				++localCount;
				System.out.println(localCount);
			}
			current.getPrev().setNext(node);
			node.setPrev(current.getPrev());
			current.setPrev(node);
			node.setNext(current);

			count++;

		}
	}

	public void delNodeHead() {

		if (head != tail) {
			head.getPrev().setNext(null);
			head = head.getPrev();
			count--;
		} else {
			tail = null;
			head = null;
			count--;
		}

	}

	public void delNodeTail() {
		if (head == tail) {
			tail = null;
			head = null;
			count--;
		} else {
			tail.getNext().setPrev(null);
			tail = tail.getNext();
			count--;
		}
	}

	public void displayListFromHead() {
		current = head;
		while (current != null) {

			System.out.print(current.getObj() + " ");
			current = current.getPrev();
		}
	}

	public void displyaFromTail() {
		current = tail;
		while (current != null) {
			System.out.print(current.getObj() + " ");
			current = current.getNext();
		}
	}

	@Override
	public Iterator<T> iterator() {

		return new Itr();
	}

	private class Itr implements Iterator<T> {
		private int itrCount = count;
		private Node<T> cur = tail;

		@Override
		public boolean hasNext() {
			return 0 < itrCount;
		}

		@Override
		public T next() {
			T item = cur.getObj();
			cur = cur.getNext();
			--itrCount;
			return item;

		}
	}
}
