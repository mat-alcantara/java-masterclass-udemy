package section5;

public class HasSharedDigit {
    public static boolean hasSharedDigit(int param1, int param2) {
        if(param1 < 10 || param2 < 10 || param1 > 99 || param2 > 99) {
            return false;
        }

        int tmp = 0;
        int tmp2 = 0;

        int number2 = param2;


        while (param1 >= 1) {
            tmp = param1 % 10;

            while (number2 >= 1) {
                tmp2 = number2 % 10;

                System.out.println(tmp + " - " + tmp2);
                if (tmp2 == tmp) {
                    return true;
                }

                number2 /= 10;
            }

            param1 /= 10;
            number2 = param2;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }
}