package patterns.lab1.composite.variant1;

public class OperationSymbol implements Expression {
    private char symbol;
    private final static char[] ALLOWED_SYMBOLS = {'+', '-', '*', '/'};

    public OperationSymbol(char symbol) {
        boolean isSymbolAllowed = false;
        for (char allowedSymbol : ALLOWED_SYMBOLS) {
            if (symbol == allowedSymbol) {
                isSymbolAllowed = true;
                this.symbol = symbol;
                break;
            }
        }
        if (!isSymbolAllowed) {
//            System.out.println("Wrong symbol '" + symbol + "'!");
            throw new IllegalArgumentException("Wrong symbol '" + symbol + "'!");
        }
    }

    public static boolean isStringContainsOperationSymbol(String string) {
        for (char allowedSymbol : ALLOWED_SYMBOLS) {
            if (string.contains("" + allowedSymbol)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getView() {
        return "" + symbol;
    }
}
