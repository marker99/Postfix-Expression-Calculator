package modelclasses;

import java.util.EmptyStackException;

public interface MyStack<T> {
	boolean isEmpty();
	void push(T elm);
	T pop() throws EmptyStackException;
}
