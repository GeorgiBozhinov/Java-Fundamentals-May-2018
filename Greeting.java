import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();


        if (firstName.isEmpty() && lastName.isEmpty()) {
            firstName = "*****";
            lastName = "*****";
            System.out.printf("Hello, %s %s!", firstName, lastName);
        }else {
            if (firstName.isEmpty()) {
                firstName = "*****";
                System.out.printf("Hello, %s %s!", firstName, lastName);
            } else if (lastName.isEmpty()) {
                lastName = "*****";
                System.out.printf("Hello, %s %s!", firstName, lastName);

            } else {
                System.out.printf("Hello, %s %s!", firstName, lastName);
            }
        }
    }
}
