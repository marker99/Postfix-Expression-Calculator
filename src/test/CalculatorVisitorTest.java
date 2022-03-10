package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorVisitorTest {
	private CalculatorVisitor cv;
	private Operand operand;
	private Operator operator;

	@BeforeEach
	public void setup() {
		cv = new CalculatorVisitor();
		operand = new Operand();
		operator = new Operator();
	}

	@Test
	public void testVisitAsOperand() {
		cv.visit(operand);
	}

	@Test
	public void testVisitAsOperator() {
		cv.visit(operator);
	}

	@Test
	public void testPushOperand() {
		cv.pushOperand(operand);
	}

	@Test
	public void testPerformOperation() {
		cv.pushOperand(operand);
		cv.pushOperand(operand);
		cv.performOperation(operator);
	}

	@Test
	public void testGetResult() {
		cv.pushOperand(operand);
		cv.pushOperand(operand);
		cv.performOperation(operator);
		cv.getResult();
	}
}
