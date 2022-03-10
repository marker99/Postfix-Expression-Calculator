package test;

import modelclasses.LinkedList;
import modelclasses.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
	private LinkedList<Integer> list;

	@BeforeEach
	public void setup() {
		list = new LinkedList<>();
	}

	@Test
	public void testIsEmpty() {
		Assertions.assertTrue(list.isEmpty());
		list.addToFront(1);
		Assertions.assertFalse(list.isEmpty());
	}

	@Test
	public void testGetSize() {
		Assertions.assertEquals(0, list.getSize());
		list.addToFront(1);
		Assertions.assertEquals(1, list.getSize());
	}

	@Test
	public void testAddToFront() {
		Assertions.assertDoesNotThrow(() -> list.addToFront(1));
	}

	@Test
	public void testRemoveFirstOnEmptyList() {
		Assertions.assertThrows(MyList.EmptyListException.class, () -> list.removeFirst());
	}

	@Test
	public void testRemoveFirstOnNotEmptyList() {
		list.addToFront(1);
		Assertions.assertDoesNotThrow(() -> list.removeFirst());
	}
}
