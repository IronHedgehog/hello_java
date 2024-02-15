package module6.RectangleArea;

 class RectangleArea {
    private int x1, y1; // Координати першої точки прямокутника
    private int x2, y2; // Координати протилежної точки прямокутника

    // Конструктор, який приймає масив координат
    public RectangleArea(int[] coords) {
        // Перевірка, чи масив має чотири елементи
        if (coords.length == 4) {
            this.x1 = coords[0];
            this.y1 = coords[1];
            this.x2 = coords[2];
            this.y2 = coords[3];
        } else {
            // Якщо масив не має чотири елементи, можна викинути виняток або здійснити інші дії
            // У цьому прикладі просто встановлюємо всі координати в нульове значення
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
        }
    }

    // Метод, який повертає площу прямокутника
    public int getArea() {
        int length = Math.abs(x2 - x1); // Довжина прямокутника (абсолютне значення різниці між x2 і x1)
        int width = Math.abs(y2 - y1);  // Ширина прямокутника (абсолютне значення різниці між y2 і y1)
        return length * width; // Площа прямокутника
    }
}
