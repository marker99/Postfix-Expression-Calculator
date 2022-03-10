import calculator.CalculatorVisitor;
import calculator.Token;

import java.util.ArrayList;

public class Client
{
    CalculatorVisitor calculatorVisitor;

    public Client(CalculatorVisitor calculatorVisitor) {
        this.calculatorVisitor = calculatorVisitor;
    }

    public int evaluateExpression(ArrayList<Token> tokens){

        for (Token token : tokens) {
            token.accept(calculatorVisitor);
        }


        return calculatorVisitor.getResult();
    }

}
