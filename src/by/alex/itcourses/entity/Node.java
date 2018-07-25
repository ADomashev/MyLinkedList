package by.alex.itcourses.entity;

public class Node<T> {

	private Node<T> next;
	private Node<T> prev;

	private T obj;

	public Node(T obj) {
		this.obj = obj;
	}

	public Node() {

	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

}
