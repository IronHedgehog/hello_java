package module7.UniqueCharCounter;

 public class UniqueCharCounter {

    public int count(String phrase) {
        int count = 0;
        boolean[] seen = new boolean[256]; // Флаги для 256 символов

        for (char c : phrase.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                count++;
            }
        }

        return count;
    }
}
// Объяснение:
// Массив флагов:
// Создает массив seen из 256 флагов
 //(по одному для каждого символа ASCII).
// Проверка:
// Перебирает символы и
// проверяет соответствующий флаг seen[c].
// Если флаг не установлен,
// устанавливает его и увеличивает count.

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
