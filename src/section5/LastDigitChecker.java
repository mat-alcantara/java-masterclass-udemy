package section5;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int param1, int param2, int param3) {
        if (!isValid(param1) || !isValid(param2) || !isValid(param3)) {
            return false;
        }

        int tmp1 = 0;
        int tmp2 = 0;
        int tmp3 = 0;

        tmp1 = param1 % 10;
        tmp2 = param2  % 10;
        tmp3 = param3  % 10;

        if (tmp1 == tmp2 || tmp1 == tmp3 || tmp2 == tmp3) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int param) {
        if (param < 10) {
            return false;
        }

        if (param > 1000) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32, 42));
    }
}