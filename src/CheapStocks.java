import java.util.Arrays;

public class CheapStocks {


    public String getCheapStocks(String[] stocks) {
        int newArrayLength = 0;
        for (int i = 0; i < stocks.length; i++) {
            String[] newArr = stocks[i].split(" ");
            int number1 = Integer.parseInt(newArr[1]);
            if (number1 < 200) {
//
                newArrayLength++;
            }
        }
        String[] resultArray = new String[newArrayLength];

        int index = 0;
        for (int i = 0; i < stocks.length; i++) {
            String[] newArr = stocks[i].split(" ");
            int number1 = Integer.parseInt(newArr[1]);
            if (number1 < 200) {
//                System.out.println("result.concat( newArr[0]) = " + result.concat(newArr[0]));
                resultArray[index] = newArr[0];
                index++;


            }
        }

        String isReady1 = Arrays.toString(resultArray).replace("[", "");
        String isReady2 = isReady1.replace(",", "");

        return isReady2.replace("]", "");
    }

    public static void main(String[] args) {
        CheapStocks stocks = new CheapStocks();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[]{10, 20, 50, 40, 34, 500};
        System.out.println(stocks.getCheapStocks(new String[]{"vys 743", "epd 11", "Ni 940", "ivn 545", "ba 165", "hiz 99", "juzo 793", "via 219", "um 857", "jo 331", "diz 76", "zini 166"}));
    }
}
