package section4;

public class SecondsAndMinutesChallenge {
    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Value");
        }

        int hours = Math.round(minutes / 60);
        int minutesAfterConvert = minutes % 60;

        System.out.println(hours + "h " + minutesAfterConvert + "m " + seconds + "s");
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        }

        int varToConvertFromSecondsToHours = 60 * 60;
        double durationInHours = (double) seconds / varToConvertFromSecondsToHours;

        int hours = (int)Math.round(durationInHours);
        int minutes = (int)Math.round((durationInHours - hours) * 60);
        int secondsAfterConvert = (int)(((durationInHours - hours) * 60) - minutes) * 60;

        System.out.println(hours + "h " + minutes + "m " + secondsAfterConvert + "s");
    }

    public static void main(String[] args) {
        getDurationString(70, 50);
        getDurationString(3660);
    }

}