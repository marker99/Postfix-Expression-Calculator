package modelclasses;

public interface MyList<T> {
	boolean isEmpty();

	int getSize();

	void addToFront(T data);

	T removeFirst() throws EmptyListException;

	class EmptyListException extends Throwable {
		// Calls directly to Super
	}

}
