
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Symbol implements Comparable<Symbol> {

    private char content;

    public Symbol(char contain) {
        this.content = contain;
    }

    public char getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.valueOf(content);
    }

    public int compareTo(Symbol anotherSymbol) {
        int state = Character.compare(this.content, anotherSymbol.content);
        if (state >= 1) {
            return 1;
        } else if (state <= -1) {
            return -1;
        } else
            return 0;
    }
}

class GroupOfSymbols {

    private Symbol[] symbols;

    public GroupOfSymbols(StringBuilder symbolsString) {
        symbols = new Symbol[symbolsString.length()];
        for (int i = 0; i < symbolsString.length(); i++) {
            symbols[i] = new Symbol(symbolsString.charAt(i));
        }
    }

    public Symbol[] getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        String groupOfSymbols = "";
        for (Symbol symbol : symbols) {
            groupOfSymbols = groupOfSymbols.concat(symbol.toString());
        }
        return groupOfSymbols;
    }
}

class Letter extends Symbol {

    public Letter(char character) {
        super(character);
    }

    public char getLetter() {
        return super.getContent();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Word implements Comparable<Word> {

    private Letter[] letters;

    public Word(StringBuilder wordString) {
        letters = new Letter[wordString.length()];
        for (int i = 0; i < wordString.length(); i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    public Letter[] getWord() {
        return letters;
    }

    @Override
    public String toString() {
        String word = "";
        for (Letter symbol : letters) {
            word = word.concat(symbol.toString());
        }
        return word;
    }

    public int compareTo(Word anotherWord) {
        Letter[] letters1 = letters;
        Letter[] letters2 = anotherWord.letters;
        int len = Math.min(letters1.length, letters2.length);
        int state;
        for (int i = 0; i < len; i++) {
            state = letters1[i].compareTo(letters2[i]);
            if (state != 0) {
                return state;
            }
        }
        return 0;
    }
}

class Digit extends Symbol {

    public Digit(char sep) {
        super(sep);
    }

    public char getDigit() {
        return super.getContent();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Number {

    private Digit[] digits;

    public Number(StringBuilder digitsString) {
        digits = new Digit[digitsString.length()];
        for (int i = 0; i < digitsString.length(); i++) {
            digits[i] = new Digit(digitsString.charAt(i));
        }
    }

    public Digit[] getNumber() {
        return digits;
    }

    @Override
    public String toString() {
        String number = "";
        for (Digit symbol : digits) {
            number = number.concat(symbol.toString());
        }
        return number;
    }
}

class Sentence {

    private HashMap<Integer, Word> words = new HashMap<>();
    private HashMap<Integer, GroupOfSymbols> symbols = new HashMap<>();
    private HashMap<Integer, Number> numbers = new HashMap<>();

    public void addWord(Integer num, Word word) {
        words.put(num, word);
    }

    public void addSymbol(Integer num, GroupOfSymbols symbol) {
        symbols.put(num, symbol);
    }

    public void addNumber(Integer num, Number number) {
        numbers.put(num, number);
    }

    public int[] length() {
        return new int[]{words.size(), symbols.size(), numbers.size()};
    }

    public ArrayList<Word> getWords() {
        return new ArrayList<>(words.values());
    }

    @Override
    public String toString() {
        int size = Arrays.stream(this.length()).sum();
        String sentence = "";
        for (int i = 0; i < size; i++) {
            if (words.containsKey(i)) {
                sentence = sentence.concat(words.get(i).toString());
                sentence = sentence.concat(" ");
            } else if (symbols.containsKey(i)) {
                sentence = sentence.concat(symbols.get(i).toString());
                sentence = sentence.concat(" ");
            } else if (numbers.containsKey(i)) {
                sentence = sentence.concat(numbers.get(i).toString());
                sentence = sentence.concat(" ");
            }
        }
        return sentence;
    }

    public static ArrayList<Word> similarWordsInSentences(Sentence comparingSentence, Sentence anotherSentence) {
        ArrayList<Word> words1 = comparingSentence.getWords();
        ArrayList<Word> words2 = anotherSentence.getWords();
        ArrayList<Word> similarWords = new ArrayList<>();
        for (Word word1 : words1) {
            for (Word word2 : words2) {
                if (word1.compareTo(word2) == 0) {
                    similarWords.add(word1);
                    break;
                }
            }
        }
        return similarWords;
    }
}


class Text {
    private final HashMap<Integer, Sentence> sentences = new HashMap<>();

    public HashMap<Integer, Sentence> getText() {
        return sentences;
    }

    public void addSentence(int num, Sentence sentence) {
        sentences.put(num, sentence);
    }

    public int textSize() {
        return sentences.size();
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < sentences.size(); i++) {
            text = text.concat(sentences.get(i).toString()) + "\n";
        }
        return text;
    }

    public Word[] jointWordsOfTheSentenceInOtherSentences(int numOfSentence) {
        if (numOfSentence < 0 && numOfSentence > this.textSize())
            throw new Error("Text haven't such number of sentence.");
        ArrayList<Word> Words = new ArrayList<>();
        ArrayList<Word> similarWords = new ArrayList<>();
        Sentence comparingSentence = sentences.get(numOfSentence);
        for (int i = 0; i < this.textSize(); i++) {
            if (i != numOfSentence) {
                Words.addAll(Sentence.similarWordsInSentences(comparingSentence, sentences.get(i)));
                for (Word word : Words) {
                    if (!similarWords.contains(word)) {
                        similarWords.add(word);
                    }
                }
            }
        }
        if (similarWords.size() == 0)
            return null;
        else {
            Word[] arr = new Word[similarWords.size()];
            return similarWords.toArray(arr);
        }
    }
}

public class ex5 {

    public static StringBuilder process_text(StringBuilder inputText,
                                             String replacer,
                                             String regExpression) {
        Pattern p = Pattern.compile(regExpression);
        Matcher m = p.matcher(inputText);
        return new StringBuilder(m.replaceAll(replacer));
    }

    public static StringBuilder read_file(String fullPath) throws FileNotFoundException {
        Scanner myReader = new Scanner(new File(fullPath));
        StringBuilder text = new StringBuilder(myReader.nextLine().toLowerCase());
        while (myReader.hasNextLine()) {
            text.append(myReader.nextLine().toLowerCase());
        }
        myReader.close();
        return text;
    }

    public static void main(String[] args) {

        final String filePath = "C:\\Users\\User\\Desktop\\cat.txt";

        try {
            StringBuilder text1 = process_text(read_file(filePath), " ", "\\s+");

            final char END_OF_TEXT = (char) 3;
            text1.append(END_OF_TEXT);

            final String dict = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`- ~@#$%^&*()_=+\\|[{]}'\"<>/;:,.?!" + END_OF_TEXT;
            boolean wordState = false;
            boolean numberState = false;
            boolean symbolsState = false;
            boolean endOfSentenceState = false;
            boolean freeState = true;
            StringBuilder word = new StringBuilder();
            StringBuilder symbols = new StringBuilder();
            StringBuilder numbers = new StringBuilder();
            char symbol;
            int indexOfSymbol;
            Sentence sentence = new Sentence();
            Text text = new Text();
            int CounterOfObjInSentence = 0;
            int CounterOfSentences = 0;
            for (int i = 0; i < text1.length(); i++) {
                symbol = text1.charAt(i);
                indexOfSymbol = dict.indexOf(symbol);
                if (freeState) {
                    if (indexOfSymbol == 64) {
                        continue;
                    } else if (indexOfSymbol <= 51) {
                        wordState = true;
                        freeState = false;
                    } else if (indexOfSymbol <= 61) {
                        numberState = true;
                        freeState = false;
                    } else if (indexOfSymbol >= 65 && indexOfSymbol <= 91) {
                        symbolsState = true;
                        freeState = false;
                    } else if (indexOfSymbol >= 92) {
                        endOfSentenceState = true;
                        freeState = false;
                    }
                }
                if (wordState) {
                    if (indexOfSymbol >= 64 && indexOfSymbol <= 94) {
                        sentence.addWord(CounterOfObjInSentence, new Word(word));
                        CounterOfObjInSentence += 1;
                        i--;
                        word = new StringBuilder();
                        wordState = false;
                        freeState = true;
                    } else
                        word.append(symbol);
                } else if (symbolsState) {
                    if (!(indexOfSymbol >= 62 && indexOfSymbol <= 91) | indexOfSymbol == 64) {
                        sentence.addSymbol(CounterOfObjInSentence, new GroupOfSymbols(symbols));
                        CounterOfObjInSentence += 1;
                        i--;
                        symbols = new StringBuilder();
                        symbolsState = false;
                        freeState = true;
                    } else
                        symbols.append(symbol);
                } else if (numberState) {
                    if (!((indexOfSymbol >= 52 && indexOfSymbol <= 61) | (indexOfSymbol >= 91 && indexOfSymbol <= 92))) {
                        sentence.addNumber(CounterOfObjInSentence, new Number(numbers));
                        CounterOfObjInSentence += 1;
                        i--;
                        numbers = new StringBuilder();
                        numberState = false;
                        freeState = true;
                    } else
                        numbers.append(symbol);
                } else if (endOfSentenceState) {
                    if (indexOfSymbol <= 91 | indexOfSymbol == 95) {
                        sentence.addSymbol(CounterOfObjInSentence, new GroupOfSymbols(symbols));
                        symbols = new StringBuilder();
                        text.addSentence(CounterOfSentences, sentence);
                        if (indexOfSymbol != 64 | i != text1.length())
                            i--;
                        CounterOfSentences += 1;
                        CounterOfObjInSentence = 0;
                        sentence = new Sentence();
                        endOfSentenceState = false;
                        freeState = true;
                    } else
                        symbols.append(symbol);
                }
                if (indexOfSymbol == 95) {
                    break;
                } else if (indexOfSymbol == -1) {
                    System.out.println("\u001B[31m" + "Caught undefined symbol = " + symbol + "\u001B[0m");
                }
            }
            System.out.println(text);
            System.out.println(new Word(new StringBuilder("domestication")).compareTo(new Word(new StringBuilder("domesticated"))));
            for (Word uniqueWord : text.jointWordsOfTheSentenceInOtherSentences(1)) {
                System.out.println(uniqueWord);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}

