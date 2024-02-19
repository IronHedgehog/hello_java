package module6.Level;

public class Level {
    private LevelInfo levelInfo;
    private Point[] point;

    public Level() {
    }

    public Level(LevelInfo levelInfo, Point[] point) {
        this.levelInfo = levelInfo;
        this.point = point;
    }

//    В нашем случае алгоритм хеширования очень простой.
//    Для каждой точки мы умножаем координаты x и y, и складываем сумму всех этих умножений.
//    Полученное число и будет хешем.
    public int calculateLevelHash(){
        int result =0;
        for (Point value : point) {
            result += value.x * value.y;
        }
        return result;
    }


    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.name + ", difficulty is "+ levelInfo.difficulty + ", point count is " + point.length;
    }

    static class Point {
        private int x;
        private int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
    }
}