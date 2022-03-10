public class Operand extends Token
{
    private Operation operation;

    @Override public void accept(CalculatorVisitor visitor)
    {
        super.accept(visitor);
    }

    public int getValue()
    {
        return 0;
    }


}
