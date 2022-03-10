import calculator.Operand;
import calculator.Operation;
import calculator.Operator;
import calculator.Token;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Client client = new Client();

        ArrayList<Token> tokens = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String s = "+";
        if(s.equals("+")){
            Operator o = new Operator(Operation.parseString("+"));
        }



        if (operator.getOperation() == Operation.PLUS){
            result = value2+value1;
        }else if (operator.getOperation() == Operation.MINUS){
            result = value2-value1;
        }else if (operator.getOperation() == Operation.MULTIPLY){
            result = value2*value1;
        }else if (operator.getOperation() == Operation.DIVISION){
            result = value2/value1;
        }


/*
        tokens.add(new Operand(5));
        tokens.add(new Operand(10));
        tokens.add(new Operator(Operation.MINUS));
        tokens.add(new Operand(10));
        tokens.add(new Operator(Operation.MULTIPLY));
        */
        System.out.println(client.evaluateExpression(tokens));
    }
}
