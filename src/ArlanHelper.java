import java.util.Arrays;

public class ArlanHelper {
    //Test output
    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }
    //    Напиши метод public String drawQuad(int n), который рисует символами '*' квадрат со стороной n.
//    public String drawQuad(int n) {
//        String string = "";
//        int counter = 0;
//        while (counter < n) {
//            string += "*";
//            counter++;
//
//        }
//       int counter1 = 0;
//        while (counter1 < n){
//            System.out.println(string);
//            counter1++;
//        }
//        return "";
//    }


//    Напиши метод public String drawRect(int width, int height, char c), который нарисует символом c прямогольник,
//    у которого height строк, каждая строка имеет width символов.

    public String drawRect(int width, int height, char c) {


        String result = "";
//        int cols = width;
//        int rows = height;
//        while (cols > 0){
//             cols--;
//
//            while(rows > 0) {
//                result += c;
//                rows--;
//            }
//            result += "\n";
//        }
        int rows = height;

        while (rows > 0) {
            int cols = width;
            while (cols > 0) {
                result += c;
                cols--;
            }
            result += "\n";
            rows--;
        }
        return result;
    }

//    Напиши метод public String drawLine(int length).
//    Он рисует линию длиной length символами '*' и '#' поочередно, начиная c символа '*' и возвращает эту линию

    public String drawLine(int length) {
        String result = "";

        while (length > 0) {

            if (length % 2 == 0) {
                result += "*";
            } else {
                result += "#";
            }

            length--;
        }

        return result;

    }

    //    Напиши метод public String drawPattern(char[] pattern, int repeatCount),
//    который принимает образец для отрисовки - pattern,
//    и количество раз, которое нужно подряд нарисовать этот образец repeatCount.
//    Метод возвращает строку с нарисованным указанное количество раз образцом.
    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";

        int repeat = repeatCount;

        while (repeat > 0) {
            int i = 0;
            while (i < pattern.length) {
                result += pattern[i];
                i++;
            }
            repeat--;
        }
        return result;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawPattern(new char[]{'J', 'a', 'v', 'a'}, 3));
    }
}