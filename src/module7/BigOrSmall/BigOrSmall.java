package module7.BigOrSmall;

public class BigOrSmall {
    public String calculate(String text) {
        char[] charArray = text.toCharArray();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                upper++;
            }
            if (Character.isLowerCase(charArray[i])) {
                lower++;
            }
        }
        if (upper > lower) {
            return "Big";
        } else if (lower > upper) {
            return "Small";
        } else {
            return "Same";
        }
    }
}
