package module7.WaterCounter;

public class WaterCounter {
    public double count(String text) {
        int spaces = 0;
        int totalChars = text.length();

        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaces++;
            }
        }

        return (double) spaces / totalChars;
    }
}
