import calculator.CalculatorVisitor;
import calculator.Token;

import java.util.ArrayList;

public class Client
{
    CalculatorVisitor calculatorVisitor;

    public Client() {
        this.calculatorVisitor = new CalculatorVisitor();
    }

    public int evaluateExpression(ArrayList<Token> tokens){

        for (Token token : tokens) {
            token.accept(calculatorVisitor);
        }

        return calculatorVisitor.getResult();
    }

}
