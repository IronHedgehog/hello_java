package module5;

public class Stars {
    public Stars() {
        this.count = 0;
    }
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Конструктор класу
    public Stars(int count) {
        this.count = count;
    }

    // Перевизначений метод toString
    @Override
    public String toString() {
        String result = "";

        // Розряди та символи
        int[] values = {1000, 100, 10, 1};
        char[] symbols = {'X', 'Y', 'Z', '*'};

        // Перебір розрядів
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            char symbol = symbols[i];

            // Визначення кількості символів поточного розряду
            int symbolCount = count / value;

            // Додавання символів до результату, якщо їх більше 0
            if (symbolCount > 0) {
                result += new String(new char[symbolCount]).replace('\0', symbol);
                count %= value;
            }
        }

        // Повертаємо результат
        return result;
    }

    // Приклад використання
    public static void main(String[] args) {
        // Створення екземпляра класу Stars
        Stars stars = new Stars(1001);

        // Виведення результату
        System.out.println(stars.toString());  // Виведе "X*"
    }
}
