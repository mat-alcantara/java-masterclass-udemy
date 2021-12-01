package section5;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }

        int totalSum = 0;

        while(bigCount > 0 && totalSum + 5 <= goal) {
            totalSum += 5;
            bigCount -= 1;
        }

        return totalSum == goal || totalSum + smallCount >= Math.abs(goal);
    }
}