import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 №3
 9165
 c3 = 0
 c13 = 2

 https://regex101.com/r/BheqLD/1
*/

public class ex3 {

    public static synchronized ArrayList<String> process_string(StringBuilder inputText, String regExpression) {

        Pattern p = Pattern.compile(regExpression);  // Встановлюємо шаблон потрібних набірів символів
        Matcher m = p.matcher(inputText);  // "Прив'язуємо" текст на обробку

        ArrayList<String> words = new ArrayList<>();  // Створюємо динамічний масив, який буде містити слова тексту
        String tmp; // Допоміжна змінна для збереження слова для перевірки його на повторюваність
        while (m.find()) {
            tmp = inputText.substring(m.start(), m.end());
            if (!words.contains(tmp)) {
                words.add(tmp);
            }
        }
        return words;
    }

    public static StringBuilder process_text(StringBuilder inputText,
                                             String replacer,
                                             String regExpression) {
        Pattern p = Pattern.compile(regExpression);  // Встановлюємо шаблон потрібних набірів символів
        Matcher m = p.matcher(inputText);  // "Прив'язуємо" текст на обробку
        // Заміняємо вказану послідовність символів на іншу послідовність символів та повертаємо текст
        return new StringBuilder(m.replaceAll(replacer));
    }

    public static StringBuilder read_file(String fullPath) {
        // Відкриваємо блок try..catch для обробки несподіваних подій
        try {
            // Створюємо об'єк Scanner та прив'язуємо файл (зміст файлу) до нього
            Scanner myReader = new Scanner(new File(fullPath));
            StringBuilder text = new StringBuilder(myReader.nextLine().toLowerCase()); // Считуємо перший рядок, конкатуємо зі змістом змінної та одразу зводимо великі букви до малих

            // Аналогічно як і із попереднім рядком. Додаємо рядки до тих пір, доки файл не закінчиться
            while (myReader.hasNextLine()) {
                text.append(myReader.nextLine().toLowerCase());
            }
            myReader.close(); // Закриваємо файл
            return text; // Повертаємо считаний та оброблений текст
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Вивід інформації у випадку несподіваної ситуації
            System.exit(-1);
            return null; // ?
        }
    }

    public static void main(String[] args) {

        final String filePath = "C:\\Users\\User\\Desktop\\cat.txt"; // Шлях до файлу

        // Читання, обробка та запис змісту файлу у змінну text
        // Оброблюємо за допомогою Regular Expressions.
        // В данному випадку прибираємо зайві символи чисел та точок для точного визначення початку першого речення
        StringBuilder text = process_text(read_file(filePath), "", "[\\d]+[.,]*[\\d]*\\s*");

        // Виділяємо перше речення з тексту для подальшої обробки.
        // За допомогою точок визначаємо межі першого речення.
        int endOfFirstSentence = text.indexOf(".");  // Дізнаємося індекс розташування першої точки
        // Поміщаємо текст першого речення у змінну методом substring() об'єкта StringBuilder
        // "Вирізаємо" текст речення від початку тексту до першої точки та одразу створюємо об'єкт класу StringBuilder з потрібним набіром символів
        StringBuilder firstSentence = new StringBuilder(text.substring(0, endOfFirstSentence));
        text.delete(0, endOfFirstSentence); // Видаляємо з тексту перше речення для запобігання включення у основний словник слів з першого речення

        // Створюємо бажані словники (першого речення та залишку тексту) одразу ініціалізуючи динамічні масиви (інтерфейс List)
        // Передаємо до методу відповідні набори символів та шаблон of Regular Expressions
        ArrayList<String> wordsInFirstSentence = process_string(firstSentence, "[\\w-]{2,}");
        ArrayList<String> wordsInSentences = process_string(text, "[\\w-]{2,}");

        // Оброблюємо словарі речення та тексту знаходячі однакові слова
        // Використовуємо метод об'єкту (класу) ArrayList для пошуку подібних слів
        ArrayList<String> specialWords = new ArrayList<>(); // Створюємо динаміний масив для запису унікальних слів з першого речення
        for (String word : wordsInFirstSentence) {
            if (!wordsInSentences.contains(word)) {
                specialWords.add(word);
            }
        }
        System.out.println(wordsInFirstSentence);
        System.out.println(wordsInSentences);
        System.out.println(specialWords);
    }
}
