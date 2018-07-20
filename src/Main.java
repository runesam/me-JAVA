public class Main {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(5000);
        bark(true, 5);
        bark(false, 15);
    }
    private static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into a position " + playerPosition + " on the high score table");
    }
    private static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 1000) {
            return 1;
        }
        return 4;
    }
    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String message;
        if (kiloBytes < 0 ) {
            message = "Invalid Value";
        } else {
            int KB = kiloBytes % 1024;
            int MB = (kiloBytes - KB) / 1024;
            message = kiloBytes + " KB = " + MB + " MB and " + KB + " KB";
        }
        System.out.println(message);
    }
    private static void bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println(false);
        }
        System.out.println(barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)));
    }
}
