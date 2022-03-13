package test;

import calculator.CalculatorVisitor;
import calculator.Operand;
import calculator.Operation;
import calculator.Operator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class CalculatorVisitorTest {
	private CalculatorVisitor cv;
	private Operand operand;
	private Operator operator;

	@BeforeEach
	public void setup() {
		cv = new CalculatorVisitor();
		operand = new Operand(3);
		operator = new Operator(Operation.PLUS);
	}

	@Test
	public void testVisitAsOperand() {
		Assertions.assertDoesNotThrow(() -> cv.visit(operand));
	}

	@Test
	public void testVisitAsOperator() {
		Assertions.assertThrows(EmptyStackException.class, () -> cv.visit(operator));
		// Putting numbers in, to stop the error
		cv.visit(operand);
		cv.visit(operand);
		Assertions.assertDoesNotThrow(() -> cv.visit(operator));
	}

	@Test
	public void testGetResult() {
		operand.accept(cv);
		operand.accept(cv);
		operator.accept(cv);
		int result = 2 * operand.getValue();
		Assertions.assertEquals(result, cv.getResult());
	}
}
