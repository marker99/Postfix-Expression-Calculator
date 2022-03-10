package test;

import calculator.Operand;
import calculator.Operation;
import calculator.Operator;
import calculator.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import run.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {
	Client c;
	private ArrayList<Token> tokenSetOne, tokenSetTwo;
	private int resultOne, resultTwo;

	@BeforeEach
	public void setup() {
		c = new Client();

		tokenSetOne = new ArrayList<>(List.of(new Token[]{new Operand(2), new Operand(3), new Operand(4), new Operator(Operation.MULTIPLY), new Operator(Operation.PLUS)}));
		resultOne = 14;

		tokenSetTwo = new ArrayList<>(List.of(new Token[]{new Operand(20), new Operand(6), new Operator(Operation.MINUS), new Operand(7), new Operator(Operation.DIVISION)}));
		resultTwo = 2;
	}

	@Test
	public void testClientOne() {
		int result = c.evaluateExpression(tokenSetOne);
		Assertions.assertEquals(resultOne, result);
		System.out.println("Result : " + result);
	}

	@Test
	public void testClientTwo() {
		int result = c.evaluateExpression(tokenSetTwo);
		Assertions.assertEquals(resultTwo, result);
		System.out.println("Result : " + result);
	}
}
