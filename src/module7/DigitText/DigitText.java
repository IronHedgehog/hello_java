package module7.DigitText;

public class DigitText {
    public boolean detect(String text) {
        for (char c : text.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}