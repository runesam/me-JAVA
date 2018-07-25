public class MethodOverloading {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main (String[] args) {
        int scoreI = calculateScore("Sam", 500);
        int scoreII = calculateScore("Cherie", 200);
        int scoreIII = calculateScore(500);
        int scoreIV = calculateScore(300);
        double resultI = calcFeetAndInchesToCentimeters(7,5);
        double resultII = calcFeetAndInchesToCentimeters(10,4);
        double resultIII = calcFeetAndInchesToCentimeters(4);
        double resultIV = calcFeetAndInchesToCentimeters(100);
        System.out.println(scoreI);
        System.out.println(scoreII);
        System.out.println(scoreIII);
        System.out.println(scoreIV);
        System.out.println(resultI);
        System.out.println(resultII);
        System.out.println(resultIII);
        System.out.println(resultIV);
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(150, 49));
        System.out.println(getDurationString(9000L));
        System.out.println(getDurationString(3945L));
    }
    private static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    private static int calculateScore(int score) {
        System.out.println("player with no name"+ " scored " + score + " points.");
        return score * 1000;
    }
    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || !(inches >= 0 && inches <= 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        return centimeters;
    }
    private static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }
        double feet =  (int) inches / 12;
        double remainInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainInches);
    }
    private static String toDecimal(long value) {
        return value < 10 ? "0" + value : value + "";
    }
    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds > 59 || seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        String rMinutes = toDecimal(minutes % 60);
        String rHours = toDecimal(minutes / 60);
        return rHours + "h " + rMinutes + "m " + toDecimal(seconds) + "s ";
    }
    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long rSeconds = seconds % 60;
        long rMinutes = seconds / 60;
        return getDurationString(rMinutes, rSeconds);
    }
}
