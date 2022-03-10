import calculator.Operand;
import calculator.Operation;
import calculator.Operator;
import calculator.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        // Setup of Objects
		Client client = new Client();
		ArrayList<Token> tokens = new ArrayList<>();

		// User Input Handling
		Scanner scanner = new Scanner(System.in);
		List<String> matchList = List.of(new String[]{"+", "-", "*", "/"});

        // Prompt user for input
		System.out.println("> Please input a Postfix Expression");
		String userInput = scanner.nextLine();

        // Split user input into usable components
		String[] userInputSplit = userInput.split(" ");

        // Defining the Tokens for the TokenList
		Token token;
		for (String s : userInputSplit) {
            // Magic
			if (matchList.contains(s)) {
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
