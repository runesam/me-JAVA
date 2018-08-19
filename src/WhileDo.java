public class WhileDo {
    private static boolean isEvenNumber(int value) {
        return value % 2 == 0;
    }

    public static void main(String [] args) {
        int count = 0;
        while (count < 6) {
            System.out.println(count);
            count++;
        }

        // reset count
        count = 0;
        while (true) {
            if (count > 5) {
                break;
            }
            System.out.println(count);
            count++;
        }
        // reset count
        count = 0;

        do {
            System.out.println(count);
            count++;
        } while (count < 5);

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
        }
    }
}
