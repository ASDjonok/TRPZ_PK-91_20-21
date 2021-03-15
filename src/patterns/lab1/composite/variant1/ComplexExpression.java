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
//        todo think of proper naming (in real: final position + 1)
        int finalPositionOfFirstExpression =
                getFinalPositionByFirstPosition(expressionString, initialPositionOfFirstExpression);

        String firstExpressionString =
                expressionString.substring(initialPositionOfFirstExpression, finalPositionOfFirstExpression);
        System.out.println("First expression = " + firstExpressionString);

        String secondExpressionString =
                expressionString.substring(finalPositionOfFirstExpression + 1, expressionString.length() - 1);
        System.out.println("Second expression = " +
                secondExpressionString);

        firstExpression = getExpressionObjectByString(firstExpressionString);
        secondExpression = getExpressionObjectByString(secondExpressionString);

    }

    private Expression getExpressionObjectByString(String firstExpressionString) {
        if (OperationSymbol.isStringContainsOperationSymbol(firstExpressionString)) {
            return new ComplexExpression(firstExpressionString);
        } else {
            if (Character.isAlphabetic(firstExpressionString.charAt(1))) {
                return new Variable(firstExpressionString);
            } else {
                return new Constant(
                        Integer.parseInt(firstExpressionString.substring(1, firstExpressionString.length() - 1)));
            }
        }
    }

    private int getFinalPositionByFirstPosition(String expressionString, int firstPosition) {
        int bracketsCounter = 1;
        int currentPosition = firstPosition + 1;
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
        return currentPosition;
    }

    @Override
    public String getView() {
        return '(' + firstExpression.getView() +
                operationSymbol.getView() +
                secondExpression.getView() + ')';
    }
}
