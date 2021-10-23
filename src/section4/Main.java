package section4;

public class Main {
    public static void main(String[] args) {
        // Speed Converter
        SpeedConverter.printConversion(1.5);

        // MegaByte Converter
        MegaByteConverter.printMegaBytesAndKiloBytes(1024);

        // Barking Dog
        BarkingDog.shouldWakeUp(true, 8);

        // Leap Year Calculator
        LeapYearCalculator.isLeapYear(1990);

        // Decimal Comparator
        DecimalComparator.areEqualByThreeDecimalPlaces(1.754, 3.678);

        // Equal Sum Checker
        EqualSumChecker.hasEqualSum(2, 3, 5);
    }
}