package section4;

public class MegaByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        // 1 MB = 1024 KB

        int kiloBytesInAMegaByte = 1024;

        int megaBytes = Math.round(kiloBytes / kiloBytesInAMegaByte);
        int remainingKiloBytes = kiloBytes % kiloBytesInAMegaByte;


        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}