package _02_Безверхий_Едуард_Володимирович.laba3;

import java.util.Arrays;
import java.util.Comparator;

public class Text {
    private String str;
    private String[] sentence;
    private String words[][];


    public Text(String str) {
        this.str = str;
        this.sentence = this.str.split("[.!?]\\s*");
        this.words = new String[this.sentence.length][];
        for (int i = 0; i < sentence.length; ++i) {
            words[i] = sentence[i].split("[\\p{Punct}\\s]+");
        }
    }

    public void SortingByWordCount() {
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].length > words[i + 1].length) {
                String[] temp1 = words[i];
                words[i] = words[i + 1];
                words[i + 1] = temp1;

                String temp2 = sentence[i];
                sentence[i] = sentence[i + 1];
                sentence[i + 1] = temp2;
            }
        }
    }

    public void getWords() {
        for (String[] i : words) {
            for (String j : i) {
                System.out.println(j);
            }
        }
    }

    public void getSentence() {
        for (int i = 0; i < this.sentence.length; i++) {
            System.out.println(sentence[i]);
        }
    }
}
