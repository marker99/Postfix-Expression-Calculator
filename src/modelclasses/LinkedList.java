package modelclasses;

import java.util.EmptyStackException;

public class LinkedList<T> implements MyList<T> {
	private Node<T> head;
	private int size;

	public LinkedList() {
		size = 0;
	}

	@Override
	public void addToFront(T data) {
		head = (Node<T>) new Node(data, head);
		size++;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T removeFirst() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			Node n = head;
			head = head.getNext();
			size--;
			return (T) n.getData();
		}
	}
}
