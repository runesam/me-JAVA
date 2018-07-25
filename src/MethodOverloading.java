public class MethodOverloading {
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
}
