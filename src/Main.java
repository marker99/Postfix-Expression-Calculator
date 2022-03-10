import calculator.Operand;
import calculator.Operation;
import calculator.Operator;
import calculator.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	// Debug mode can be turned on, in modelclasses\LinkedStack.java

	public static void main(String[] args) throws Exception {
		// Setup of Objects
		Client client = new Client();

		// User Input Handling
		Scanner scanner = new Scanner(System.in);
		List<String> matchList = List.of(new String[]{"+", "-", "*", "/"});
		List<String> quitList = List.of(new String[]{"quit", "exit", "stop", "pineapplejuice"});
		while (true) {
			calculationLoop(client, scanner, matchList, quitList);
		}
	}

	private static void calculationLoop(Client client, Scanner scanner, List<String> matchList, List<String> quitList) throws Exception {
		ArrayList<Token> tokens = new ArrayList<>();
		// Prompt user for input
		System.out.println("\n\n> Please input a Postfix Expression");
		String userInput = scanner.nextLine();

		// Split user input into usable components
		String[] userInputSplit = userInput.split(" ");

		// Defining the Tokens for the TokenList
		Token token;
		for (String s : userInputSplit) {
			// Magic
			if (quitList.contains(s)) {
				throw new Exception("User is attempting to leave");
			} else if (matchList.contains(s)) {
				token = new Operator(Operation.parseString(s));
			} else {
				token = new Operand(Integer.parseInt(s));
			}
			tokens.add(token);
		}

		// Evaluate and print out the result. It is also here we end up crashing, a lot ;)
		System.out.println("And the result is: " + client.evaluateExpression(tokens));
	}
}
