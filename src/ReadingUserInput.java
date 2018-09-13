import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Year of birth:");

        if (scanner.hasNextInt()) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Your Name:");
            String name = scanner.nextLine();

            int age = 2018 - yearOfBirth;

            System.out.println("Your Name is: " + name);
            System.out.println("Your are: " + age + " years old");
        } else {
            System.out.println("error");
        }

        scanner.close();
    }
}
