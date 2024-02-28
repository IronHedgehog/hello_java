package module7.DigitExtracter;

import java.util.Arrays;
import java.sql.Array;

public class DigitExtracter {
    public int[] extract(String text) {
        char[] charArray = text.toCharArray();
        int newArrayLength = 1;

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                newArrayLength++;
            }
        }

        int[] result = new int[newArrayLength - 1];
        int index = 0;

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                result[index++] = c - '0';
            }
        }

        return result;
    }
}


class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}