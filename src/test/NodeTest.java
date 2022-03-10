package test;

import modelclasses.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {
	private Node<Integer> node;

	@BeforeEach
	public void setup() {
		node = new Node<>();
	}

	@Test
	public void testSetData() {
		Assertions.assertDoesNotThrow(() -> node.setData(1));
	}

	@Test
	public void testGetData() {
		int i = 1;
		node.setData(i);
		Assertions.assertEquals(i, node.getData());
	}

	@Test
	public void setNextNode() {
		Node<Integer> n = new Node<>(1);
		Assertions.assertDoesNotThrow(() -> node.setNext(n));
	}

	@Test
	public void getNextNode() {
		Node<Integer> n = new Node<>();
		node.setNext(n);
		Assertions.assertEquals(n, node.getNext());
	}
}
