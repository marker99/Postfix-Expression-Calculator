package modelclasses;

import java.util.EmptyStackException;

public class LinkedStack<T> implements MyStack<T> {
	private LinkedList<T> list;

	public LinkedStack() {
		list = new LinkedList<T>();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(T elm) {
		list.addToFront(elm);
	}

	@Override
	public T pop() {
		try {
			return list.removeFirst();
		} catch (MyList.EmptyListException e) {
			throw new EmptyStackException();
		}
	}
}
