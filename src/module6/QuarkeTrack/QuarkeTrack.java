package module6.QuarkeTrack;

import java.util.Arrays;

public class QuarkeTrack {
    private int[] lines; // Масив довжин пробіжок

    // Конструктор, який приймає масив довжин пробіжок
    public QuarkeTrack(int[] lines) {
        this.lines = lines;
    }

    // Перевизначення методу equals() для порівняння об'єктів QuarkeTrack
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuarkeTrack that = (QuarkeTrack) o;
        return Arrays.equals(lines, that.lines);
    }

    // Перевизначення методу hashCode() для отримання хеш-коду
    @Override
    public int hashCode() {
        return Arrays.hashCode(lines);
    }

    public static void main(String[] args) {
        // Приклад використання класу QuarkeTrack
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 3, 5};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        // Порівняння об'єктів за допомогою equals()
        System.out.println(track1.equals(track2)); // false
        System.out.println(track1.equals(track3)); // true

        // Виведення хеш-кодів
        System.out.println(track1.hashCode() == track2.hashCode()); // false
        System.out.println(track1.hashCode() == track3.hashCode()); // true
    }
}
