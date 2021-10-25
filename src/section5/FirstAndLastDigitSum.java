package section5;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String numInString = "" + number;
        int sum = 0;

        if(numInString.length() == 1){
            return number * 2;
        }

        for(int i = 0; i < numInString.length(); i += 1){
            if (i == 0 || i == (numInString.length() - 1)) {
                int numberToSum = Character.getNumericValue(numInString.charAt(i));
                sum += numberToSum;
            }
        }

        return sum;

    }
}