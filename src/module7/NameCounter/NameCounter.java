package module7.NameCounter;

public class NameCounter {

    public int count(String text) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (isProperNoun(word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isProperNoun(String word) {
        // Проверяем, что слово имеет хотя бы две буквы
        if (word.length() < 2) {
            return false;
        }

        // Проверяем, что первая буква - заглавная, а остальные - строчные
        char firstChar = word.charAt(0);
        if (!Character.isUpperCase(firstChar)) {
            return false;
        }

        String restOfWord = word.substring(1);
        if (!restOfWord.equals(restOfWord.toLowerCase())) {
            return false;
        }
//        Этот фрагмент кода проверяет, состоит ли оставшаяся часть слова (после первой буквы)
//        только из строчных букв. Давайте разберем этот код пошагово:

//        word.substring(1): Эта строка кода создает подстроку restOfWord, начиная с индекса 1 (второй символ)
//        и до конца слова word. Таким образом, restOfWord содержит все символы, кроме первого.

//        !restOfWord.equals(restOfWord.toLowerCase()): Здесь сравнивается исходная подстрока restOfWord
//        с ее версией в нижнем регистре (restOfWord.toLowerCase()). Если они не совпадают, то это означает,
//        что в подстроке restOfWord есть хотя бы одна заглавная буква.
        
//        Если условие !restOfWord.equals(restOfWord.toLowerCase()) выполняется, то метод возвращает false,
//         что означает, что слово не является именем собственным согласно заданным условиям.
//         В противном случае, если все условия выполняются, метод возвращает true,
//         указывая на то, что слово является именем собственным.

        return true;
    }

    public static void main(String[] args) {
        NameCounter nameCounter = new NameCounter();

        // Примеры использования
        System.out.println(nameCounter.count("Mars is great planet"));  // Вернет 1
        System.out.println(nameCounter.count("Moon is near Earth"));  // Вернет 2
        System.out.println(nameCounter.count("SPACE IS GREAT"));  // Вернет 0
    }
}

