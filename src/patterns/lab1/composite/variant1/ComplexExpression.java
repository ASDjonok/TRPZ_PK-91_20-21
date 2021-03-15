package patterns.lab1.composite.variant1;

public class ComplexExpression implements Expression {
    private Expression firstExpression;
    private Expression secondExpression;
    private OperationSymbol operationSymbol;

    private final int initialPositionOfFirstExpression = 1;

    public ComplexExpression(Expression firstExpression,
                             OperationSymbol operationSymbol,
                             Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.operationSymbol = operationSymbol;
    }

    public ComplexExpression(String expressionString) {
        int bracketsCounter = 1;
        int currentPosition = initialPositionOfFirstExpression + 1;
        do {
            if (expressionString.charAt(currentPosition) == '(') {
                bracketsCounter++;
            } else {
                if (expressionString.charAt(currentPosition) == ')') {
                    bracketsCounter--;
                }
            }
            currentPosition++;
        } while (bracketsCounter != 0);

        System.out.println("First expression = " +
                expressionString.substring(initialPositionOfFirstExpression, currentPosition));

    }

    @Override
    public String getView() {
        return '(' + firstExpression.getView() +
                operationSymbol.getView() +
                secondExpression.getView() + ')';
    }
}
