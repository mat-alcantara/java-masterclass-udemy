package section4;

public class SecondsAndMinutesChallenge {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Value");
        }

        int hours = minutes / 60;
        int minutesAfterConvert = minutes % 60;

        String hoursString = hours < 10 ? "0" + hours + "h" : hours + "h";
        String minutesString = minutesAfterConvert < 10 ? "0" + minutesAfterConvert + "m" : minutesAfterConvert + "m";
        String secondsString = seconds < 10 ? "0" + seconds + "s" : seconds + "s";

        return String.format(hoursString + " " + minutesString + " " + secondsString);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        }

        int varToConvertFromSecondsToHours = 60 * 60;
        double durationInHours = (double) seconds / varToConvertFromSecondsToHours;

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(99, 50));
        System.out.println(getDurationString(3660));
    }

}