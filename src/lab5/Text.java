package lab5;

public class Text {
    private Sentence[] sentences;

    /*public Text() {
    }*/

    public Text(String textString) {
//        String[] splitSentenceStrings = textString.split("[.!?]");
        String[] splitSentenceStrings = textString.split("(?<=[?!.] )");
        sentences = new Sentence[splitSentenceStrings.length];
        for (int i = 0; i < splitSentenceStrings.length; i++) {
            sentences[i] = new Sentence(splitSentenceStrings[i]);
        }
    }
}
