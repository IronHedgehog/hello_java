public class ArlanHelper {
    //Test output

    public String drawQuad(int n) {
        String string = "";
        int counter = 0;
        while (counter < n) {
            string += "*";
            counter++;

        }
       int counter1 = 0;
        while (counter1 < n){
            System.out.println(string);
            counter1++;
        }
        return "";
    }

    //    Напиши метод public String drawQuad(int n), который рисует символами '*' квадрат со стороной n.
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(20));
    }
}