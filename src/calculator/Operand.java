package calculator;

public class Operand extends Token {
	private int value;

	public Operand(int value) {
		this.value = value;
	}

	@Override
	public void accept(CalculatorVisitor visitor) {
		visitor.visit(this);
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.format("%d", value);
	}
}
