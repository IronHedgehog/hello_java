public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }
    public int countSumOfDigits(int number) {
        int result = 0;

        while (number > 0) {
            int lastDigit = number % 10; // Получаем последнюю цифру числа
            result += lastDigit; // Добавляем цифру к результату
            number /= 10; // Убираем последнюю цифру из числа
        }

        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}