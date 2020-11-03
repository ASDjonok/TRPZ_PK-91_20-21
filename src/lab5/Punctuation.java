package lab5;

public class Punctuation implements SentenceMember {
    private String string;

    public Punctuation(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
