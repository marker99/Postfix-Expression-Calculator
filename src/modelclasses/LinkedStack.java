package modelclasses;

import java.util.EmptyStackException;

public class LinkedStack<T> implements MyStack<T> {
	private static final boolean DEBUG_MODE = false;
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
		if (DEBUG_MODE) {
			System.out.println("STACK: " + list.toString());
		}
	}

	@Override
	public T pop() {
		try {
			T t = list.removeFirst();
			if (DEBUG_MODE) {
				System.out.println("STACK: " + list.toString());
			}
			return t;
		} catch (MyList.EmptyListException e) {
			throw new EmptyStackException();
		}
	}
}
