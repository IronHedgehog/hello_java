package module7.WordFreqCounter;

public class WordFreqCounter {

     float countFreq(String phrase, String word) {
        // Подсчет слов
        int totalWords = 0;
        for (String w : phrase.split(" ")) {
            totalWords++;
        }

        // Подсчет вхождений слова
        int wordCount = 0;
        for (String w : phrase.split(" ")) {
            if (w.equalsIgnoreCase(word)) {
                wordCount++;
            }
        }

        // Вычисление частоты
        return (float) wordCount / totalWords;
    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}