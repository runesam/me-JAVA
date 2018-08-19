public class Switch {
    private static void ifStatement(int value) {
        if (value == 1) {
            System.out.println("value was 1");
        }
    }

    private static void switchCase(int switchValue) {
        switch (switchValue) {
            case 1: System.out.println("value was one"); break;
            case 2: System.out.println("value was two"); break;
            case 3: System.out.println("value was three"); break;
            default: System.out.println("value was not 1, 2 or 3");
        }
    }

    public static void main(String [] args) {
        ifStatement(1);
        ifStatement(3);

        switchCase(5);
        switchCase(2);
    }
}
