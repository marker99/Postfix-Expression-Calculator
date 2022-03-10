import modelclasses.LinkedStack;

public class CalculatorVisitor implements Visitor, Calculator
{

    private LinkedStack<Token> tokenStack;

    @Override public void visit(Operand operand)
    {

    }

    @Override public void visit(Operator operator)
    {

    }

    @Override public int getResult()
    {
        return 0;
    }

    private void pushOperand(Operand operand)
    {

    }

    private void performOperation(Operator operator)
    {

    }
}
