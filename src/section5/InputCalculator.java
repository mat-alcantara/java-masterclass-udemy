package section5;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;
        int avg = 0;

        while(true) {
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                sum += scanner.nextInt();
                avg = (int)Math.round((double) sum/counter);

                counter += 1;
                scanner.nextLine();
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }

        scanner.close();
    }
}