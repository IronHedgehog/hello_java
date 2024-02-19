package module6.TargetFinder;

import java.util.Arrays;

public class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int minDistance = Integer.MAX_VALUE;
        int[] nearestTarget = new int[2];

        for (int[] target : targets) {
            int distance = getDistance(aiCoords, target);
            if (distance < minDistance) {
                minDistance = distance;
                nearestTarget = target;
            }
        }

        return nearestTarget;
    }

    private int getDistance(int[] aiCoords, int[] target) {
        int dx = target[0] - aiCoords[0];
        int dy = target[1] - aiCoords[1];
        return dx * dx + dy * dy;
    }

    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        System.out.println(Arrays.toString(nearestTarget)); // [15, 14]
    }
}