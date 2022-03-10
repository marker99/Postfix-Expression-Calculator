public interface Calculator
{
    public void visit(Operand operand);

    public void visit(Operator operator);
}
