public class ATM {
    public int countBanknotes(int sum) {
        int[] availableBanknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int remainingSum = sum;
        int index = 0;

        while (remainingSum > 0 && index < availableBanknotes.length) {
            int banknote = availableBanknotes[index];
            int numberOfBanknotes = remainingSum / banknote;
            count += numberOfBanknotes;
            remainingSum %= banknote;
            index++;
        }

        return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(500)); // Выведет 1
        System.out.println(atm.countBanknotes(578)); // Выведет 6
    }
}
