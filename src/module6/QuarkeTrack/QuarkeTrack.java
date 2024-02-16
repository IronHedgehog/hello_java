package module6.QuarkeTrack;

import java.util.Objects;

public class QuarkeTrack {

    private final int[] trackData;

    public QuarkeTrack(int[] lines) {
        this.trackData = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return getTrackSum() == that.getTrackSum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrackSum());
    }

    private int getTrackSum() {
        int sum = 0;
        for (int distance : trackData) {
            sum += distance;
        }
        return sum;
    }
}

class Main {

    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        // false
        System.out.println(track1.equals(track2));

        // true
        System.out.println(track1.equals(track3));

        // Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        // true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}


//Клас QuarkeTrack:
//
//Конструктор public QuarkeTrack(int[] lines) приймає масив цілих чисел, які представляють довжину пробіжки кожного гравця.
//Перевизначений метод equals() порівнює два об'єкти QuarkeTrack за сумою довжин їх пробіжок.
//Перевизначений метод hashCode() використовує Objects.hash() для обчислення хеш-коду, заснованого на сумі довжин пробіжок.
//Приклад використання:
//
//Створені три об'єкти QuarkeTrack з різними масивами довжин пробіжок.
//Порівнюються об'єкти track1 і track2, track1 і track3, track2 і track3 за допомогою методу equals().
//Виводяться хеш-коди об'єктів track1, track2 і track3.
//Результат:
//
//track1 і track3 мають однакову суму довжин пробіжок, тому track1.equals(track3) повертає true.
//track1 і track2 мають різні суми довжин пробіжок, тому track1.equals(track2) повертає false.
//Хеш-коди track1 і track3 однакові, тому що вони мають однакову суму довжин пробіжок.
//Хеш-коди track1 і track2 можуть бути однаковими або різними,
//Додатково:
//
//Замість Objects.hash() можна використовувати інший метод для обчислення хеш-коду.
//Можна додати інші методи в клас QuarkeTrack для роботи з даними