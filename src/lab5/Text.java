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

    public void swapFirstAndLastWordsInEverySentence() {
        for (Sentence sentence : sentences) {
            sentence.swapFirstAndLastWords();
        }
    }

    @Override
    public String toString() {
        /*String textString = "";
        for (Sentence sentence : sentences) {
            textString += sentence.toString() + " ";
        }
        return textString;*/
        StringBuilder textString = new StringBuilder();
        for (Sentence sentence : sentences) {
            textString.append(sentence.toString()).append(" ");
        }
        return textString.toString();
    }
}
