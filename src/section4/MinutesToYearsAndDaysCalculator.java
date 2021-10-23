package section4;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int hoursInADay = 24;
        int minutesInAnHour = 60;
        int daysInAYear = 365;

        long years = minutes / (minutesInAnHour * hoursInADay * daysInAYear);

        long days = (minutes / (minutesInAnHour * hoursInADay)) - (365 *years);


        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}