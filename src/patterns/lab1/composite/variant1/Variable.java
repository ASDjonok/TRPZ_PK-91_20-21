package patterns.lab1.composite.variant1;

public class Variable extends SimpleExpression {
    private String name;

    public Variable(String name) {
//        if (Character.isDigit(name.charAt(0))) {
        if (!Character.isAlphabetic(name.charAt(1))) {
            throw new IllegalArgumentException("First character of variable name" +
                    " should be alphabetic.");
        }
        this.name = name;
    }

    @Override
    public String getView() {
        return "(" + name + ")";
    }
}
