import modelclasses.LinkedStack;

public class CalculatorVisitor implements Visitor, Calculator
{

    private LinkedStack<Token> tokenStack;


    @Override public void visit(Operand operand)
    {
        pushOperand(operand);
    }

    @Override public void visit(Operator operator)
    {
        performOperation(operator);
    }

    @Override public int getResult()
    {
        return 0;
    }

    private void pushOperand(Operand operand)
    {
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator)
    {
        int value1 = ((Operand) tokenStack.pop()).getValue();
        int value2 = ((Operand) tokenStack.pop()).getValue();
        int result = 0;

        if (operator.getOperation() == Operation.PLUS){
            result = value2+value1;

        }else if (operator.getOperation() == Operation.MINUS){
            result = value2-value1;
        }else if (operator.getOperation() == Operation.MULTIPLY){
            result = value2*value1;

        }else if (operator.getOperation() == Operation.DIVISION){
            result = value2/value1;
        }

        tokenStack.push(new Operand(result));

    }

}
