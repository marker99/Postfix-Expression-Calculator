package calculator;

import java.util.InputMismatchException;

public enum Operation {
	PLUS,
	MINUS,
	MULTIPLY,
	DIVISION;


	public static Operation parseString(String s) {
		return switch (s) {
			case "+" -> PLUS;
			case "-" -> MINUS;
			case "*" -> MULTIPLY;
			case "/" -> DIVISION;
			default -> throw new InputMismatchException("Invalid Operation");
		};
	}

	public static String toActualString(Operation o) {
		return switch (o) {
			case  PLUS -> "+";
			case  MINUS -> "-";
			case  MULTIPLY -> "*";
			case  DIVISION -> "/";
		};
	}
}


