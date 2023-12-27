//public class TriangleDrawer {
//    public String drawTriangle(int side) {
//
//        String result = "";
//        int currentSide = side;
//        int counter = 0;
//        while (currentSide > 0) {
//
//            while (counter < currentSide) {
//                result += "*";
//                counter++;
//            }
//            result += "\n";
//            currentSide--;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        TriangleDrawer triangle = new TriangleDrawer();
//        System.out.println(triangle.drawTriangle(10));
//    }
//}

public class TriangleDrawer {
    public String drawTriangle(int side) {
        StringBuilder result = new StringBuilder();
        int currentSide = side;

        while (currentSide > 0) {
            result.append("*".repeat(currentSide));
            result.append("\n");
            currentSide--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}