public class ForLoop {
    public static void main(String [] args) {
        int totalSum = 0;
        int totalCount = 0;
        for (int value = 1; value <= 1000; value++) {
            boolean three = value % 3 == 0;
            boolean five = value % 5 == 0;
            if (three && five) {
                System.out.println(value);
                totalSum += value;
                totalCount++;
            }
            if (totalCount == 5) {
                break;
            }
        }
        System.out.println("total Sum " + totalSum);
    }
}
