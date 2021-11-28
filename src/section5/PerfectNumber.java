package section5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        int counter = 1;


        while (counter < number) {
            if (number % counter == 0) {
                sum += counter;
            }

            counter += 1;
        }

        return sum == number;
    }
}