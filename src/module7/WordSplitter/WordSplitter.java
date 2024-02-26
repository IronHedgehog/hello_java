package module7.WordSplitter;

import java.util.Arrays;

class WordSplitter {

    public String[] split(String phrase) {
        // Розбиття фрази на слова
        String[] words = phrase.split("\\s+");

        // Кількість непустх слів
        int cleanedWordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                cleanedWordCount++;
            }
        }

        // Створення нового масиву для очищених слів
        String[] cleanedWords = new String[cleanedWordCount];

        // Заповнення нового масиву
        int i = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                cleanedWords[i++] = word.toLowerCase();
            }
        }

        // Повернення очищених слів
        return cleanedWords;
    }
}


class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
