package test;

import modelclasses.LinkedStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class LinkedStackTest {
	LinkedStack<Integer> stack;

	@BeforeEach
	void setup() {
		stack = new LinkedStack<>();
	}

	@Test
	void testPopOnEmptyStack() {
		// Newly created stack is Empty
		Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
	}

	@Test
	void testPopOnNotEmptyStack() {
		stack.push(1);
		Assertions.assertDoesNotThrow(() -> stack.pop());
	}

	@Test
	void testIsEmpty() {
		Assertions.assertTrue(stack.isEmpty());
		stack.push(1);
		Assertions.assertFalse(stack.isEmpty());
	}

	@Test void testPop(){
		int i = 1;
		stack.push(i);
		Assertions.assertEquals(i, stack.pop());
	}
}
