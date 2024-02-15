package module6.CircleIntersector;

 class CircleIntersector {
     private int x1, y1, r1; // Параметры первого круга
     private int x2, y2, r2; // Параметры второго круга

     // Конструктор, принимающий координаты и радиусы двух кругів
     public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
         this.x1 = x1;
         this.y1 = y1;
         this.r1 = r1;
         this.x2 = x2;
         this.y2 = y2;
         this.r2 = r2;
     }

     // Переопределение метода toString() для визначення перетину кругів
     @Override
     public String toString() {
         // Визначення дистанції між центрами кругів
         double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

         // Визначення перетину кругів
         if (distance <= r1 + r2) {
             return "intersects";
         } else {
             return "not intersects";
         }
     }
 }
