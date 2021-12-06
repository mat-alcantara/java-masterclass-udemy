package section5;

import java.util.Scanner;

class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int totalSum = 0;
        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Digite o " + counter + " número: ");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                totalSum += scanner.nextInt();
                scanner.nextLine();

                counter += 1;
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
        }

        System.out.println("A soma total é " + totalSum);
    }
}