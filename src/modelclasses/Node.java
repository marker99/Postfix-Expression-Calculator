package modelclasses;

public class Node<T> {
	private T data;
	private Node<T> nextNode;

	public Node(T data, Node<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return data;
	}

	public void setNext(Node<T> node){
		nextNode = node;
	}

	public Node<T> getNext() {
		return nextNode;
	}
}
