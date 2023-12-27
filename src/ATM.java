public class ATM {
    public int countBanknotes(int sum) {
        // Масив з номіналами доступних банкнот
        int[] availableBanknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        // Змінна для зберігання загальної кількості банкнот
        int count = 0;
        // Змінна для відстеження залишкової суми
        int remainingSum = sum;
        // Індекс для проходження по масиву банкнот
        int index = 0;

        // Цикл while буде виконуватися, поки залишкова сума більше 0 і не буде досягнутий кінець масиву
        while (remainingSum > 0 && index < availableBanknotes.length) {
            // Отримуємо поточний номінал банкноти
            int banknote = availableBanknotes[index];
            // Визначаємо кількість банкнот даного номіналу, яку можна використовувати
            int numberOfBanknotes = remainingSum / banknote;
            // Збільшуємо загальну кількість банкнот
            count += numberOfBanknotes;
            // Визначаємо залишкову суму після видачі банкнот даного номіналу
            remainingSum %= banknote;
            // Переходимо до наступного номіналу банкноти
            index++;
        }

        // Повертаємо загальну кількість банкнот
        return count;
    }

    public static void main(String[] args) {
        // Створюємо екземпляр класу ATM
        ATM atm = new ATM();
        // Приклади виклику методу countBanknotes та виведення результату
        System.out.println(atm.countBanknotes(500)); // Виведе 1
        System.out.println(atm.countBanknotes(578)); // Виведе 6
    }
}


//Клас ATM містить метод countBanknotes, який приймає суму (sum) і повертає мінімальну кількість банкнот для видачі цієї суми.
//У методі використовується цикл while, який проходить по масиву availableBanknotes
//і визначає кількість банкнот кожного номіналу, необхідних для видачі суми.
//Змінні count і remainingSum оновлюються на кожній ітерації.
//Після завершення циклу повертається загальна кількість банкнот.
