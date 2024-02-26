package module7.PunctuationMarkCounter;

public class PunctuationMarkCounter {

    public int count(String phrase) {
        int count = 0;
        for (char c : phrase.toCharArray()) {
            if (isPunctuationMark(c)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPunctuationMark(char c) {
        return c == '.' || c == ',' || c == '!' || c == ':' || c == ';';
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}