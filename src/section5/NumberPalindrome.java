package section5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int numberToReverse = number;
        int reverse = 0;

        while(numberToReverse != 0) {
            int remainder = numberToReverse % 10;
            reverse = reverse * 10 + remainder;
            numberToReverse = numberToReverse/10;
        }

        return reverse == number;
    }
}