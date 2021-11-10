package section5;

public class EvenDigitNumber {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int result = 0;
        int tmp = 0;

        // Sum all even numbers between 0 and number
        while(number > 0) {
            tmp = number % 10;

            if(tmp % 2 == 0) {
                result += tmp;
            }

            number /= 10;


        }

        return result;
    }
}