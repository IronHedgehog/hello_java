package module7.WordDeleter;

public class WordDeleter {

    public String remove(String phrase, String[] wordsToRemove) {
        StringBuilder sb = new StringBuilder();
        String[] split = phrase.split(" ");

        for (String word : split) {
            boolean shouldRemove = false;
            for (String removeWord : wordsToRemove) {
                if (word.equals(removeWord)) {
                    shouldRemove = true;
                    break;
                }
            }
            if (!shouldRemove) {
                sb.append(word).append(" ");
            }
        }

        return sb.toString().trim();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}