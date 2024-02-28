package module7.EmailDetector;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDetector {
    public boolean isPresent(String text) {
        // Используем регулярное выражение для поиска email
        String regex = "\\S\\S@\\S\\S";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Проверяем, есть ли совпадение в тексте
        return matcher.find();
    }
}
