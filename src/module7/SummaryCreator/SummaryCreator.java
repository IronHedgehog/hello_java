package module7.SummaryCreator;

public class SummaryCreator {
    public String create(String text) {
        if (text.length() <= 15) {
            return text;
        } else {
            String summary = text.substring(0, 15);
            if (!Character.isWhitespace(text.charAt(15))) {
                summary += "...";
            }
            return summary;
        }
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}