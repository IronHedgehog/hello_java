import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for (int price : prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices) {
        int index = 0;
        int newLengthArr = 0;
        for (int i = 0; i < prices.length; i++) {
            if (Integer.toString(prices[i]).endsWith("9")) {
                newLengthArr++;
            }
        }
        int[] newArray = new int[newLengthArr];
        for (int i = 0; i < prices.length; i++) {
            if (Integer.toString(prices[i]).endsWith("9")) {
                newArray[index] = prices[i];
                index++;
            }

        }
        return newArray;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        int newArrayLength = showcaseStocks.length + warehouseStocks.length;
        String[] resultArray = new String[newArrayLength];

        int index = 0;

        for (int i = 0; i < showcaseStocks.length; i++) {
            resultArray[index] = showcaseStocks[i];
            index++;
        }
        for (int i = 0; i < warehouseStocks.length; i++) {
            resultArray[index] = warehouseStocks[i];
            index++;
        }

        return resultArray;
    }

    //    Он принимает список цен, и суммирует их, включая лишь те, которые больше чем minPrice (включительно)
//    и меньше чем maxPrice (включительно)и возвращает сумму.
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                result += prices[i];
            }
        }
        return result;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[]{10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}