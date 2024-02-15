package module6.Distance;

public class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    public Distance() {
    }

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    /**
     * Обчислює відстань між двома точками на площині за допомогою формули
     * відстані між двома точками у двовимірному просторі.
     *
     * @return Ціле число, яке представляє округлену відстань між точками.
     */
    public int getDistance() {
        // Обчислення різниці координат по осях і їх квадратів
        double distance = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));

        // Округлення відстані до найближчого цілого числа
        return (int) Math.round(distance);
    }
}
