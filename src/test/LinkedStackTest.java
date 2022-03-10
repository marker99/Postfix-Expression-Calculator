package test;

import modelclasses.LinkedStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class LinkedStackTest {
	LinkedStack<Integer> stack;

	@BeforeEach
	void setup(){
		stack = new LinkedStack<>();
	}

	@Test
	void testEmptyStack(){
		// Newly created stack is Empty
		Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
	}

}
