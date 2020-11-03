package lab5;

public class Letter /*implements SentenceMember*/{
//    private char[] chars;
    private char character;

    /*public Letter(char[] chars) {
        this.chars = chars;
    }

    public Letter(String text) {
        chars = text.toCharArray();
    }*/

    public Letter(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "" + character;
    }
}
