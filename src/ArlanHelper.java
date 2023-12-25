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

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}