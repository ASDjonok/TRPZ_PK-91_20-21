package lab5;

public class Sentence {
    /*private Word[] words;
    private Punctuation[] punctuations;*/

    //    private Object[] wordsAndPunctuations;
    private SentenceMember[] sentenceMembers/* = {new Word(), new Punctuation()*//*, new Letter('a')*//*}*/;
    private static final String PUNCTUATIONS_STRING = ",.!?";


    public Sentence(String sentenceString) {
        String[] splitSentenceElementsStrings = sentenceString.split("(?=[" + PUNCTUATIONS_STRING + "])|\\s");
        sentenceMembers = new SentenceMember[splitSentenceElementsStrings.length];
        for (int i = 0; i < splitSentenceElementsStrings.length; i++) {
            if (PUNCTUATIONS_STRING.contains(splitSentenceElementsStrings[i])) {
                sentenceMembers[i] = new Punctuation(splitSentenceElementsStrings[i]);
            } else {
                sentenceMembers[i] = new Word(splitSentenceElementsStrings[i]);
            }
        }
    }

    public void swapFirstAndLastWords() {
        SentenceMember temporarySentenceMember = sentenceMembers[0];
        sentenceMembers[0] = sentenceMembers[sentenceMembers.length - 2];
        sentenceMembers[sentenceMembers.length - 2] = temporarySentenceMember;
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (SentenceMember sentenceMember : sentenceMembers) {
//            todo think about spaces between word and punctuation
//            todo think about capital letters
            sentenceString.append(sentenceMember.toString()).append(" ");
        }
        return sentenceString.toString();
    }
}
