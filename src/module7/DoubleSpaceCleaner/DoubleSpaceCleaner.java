package module7.DoubleSpaceCleaner;

public class DoubleSpaceCleaner {

    public String clean(String phrase) {
        // Удаление пробелов в начале и конце
        String trimmedPhrase = phrase.trim();

        // Замена двойных пробелов на одиночные
        return trimmedPhrase.replaceAll("\\s+", " ");
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
