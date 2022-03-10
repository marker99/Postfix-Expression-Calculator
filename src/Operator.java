public class Operator extends Token
{
    private int value;

    @Override public void accept(CalculatorVisitor visitor)
    {
        super.accept(visitor);
    }

    public Operation getOperation()
    {
        return null;
    }

}
