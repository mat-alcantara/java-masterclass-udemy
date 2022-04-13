package section8;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int arraySize) {
        int challengeArray[] = {};

        for(int i = 0; i < arraySize; i += 1) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            int arrayNumber = myObj.nextInt();  // Read user input

            challengeArray.add(arrayNumber) ;

            myObj.close();
        }

        System.out.println(challengeArray);

        return challengeArray;
    }

    public static void printArray(int[] arrayToPrint) {
        for(int i = 0; i < arrayToPrint.length; i += 1) {
            System.out.println("Element " + i + " contents " + arrayToPrint[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        Arrays.sort(unsortedArray);

        return unsortedArray;
    }
}