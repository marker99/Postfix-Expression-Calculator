import calculator.Operand;
import calculator.Operation;
import calculator.Operator;
import calculator.Token;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Client client = new Client();

        ArrayList<Token> tokens = new ArrayList<>();

        tokens.add(new Operand(5));
        tokens.add(new Operand(10));
        tokens.add(new Operator(Operation.MINUS));
        tokens.add(new Operand(10));
        tokens.add(new Operator(Operation.MULTIPLY));


        System.out.println(client.evaluateExpression(tokens));

    }
}
