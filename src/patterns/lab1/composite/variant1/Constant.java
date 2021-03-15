package patterns.lab1.composite.variant1;

public class Constant extends SimpleExpression {
    private int number;

    public Constant(int number) {
        this.number = number;
    }

    @Override
    public String getView() {
        return "(" + number + ")";
    }
}
