import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadInput {

   // public static class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String firstWord = scanner.next("\\w+");
            String secondWord = scanner.next("\\w+");
            int numOne = scanner.nextInt();
            int numTwo = scanner.nextInt();
            int numThree = scanner.nextInt();
            scanner.nextLine();
            String thirdWord = scanner.nextLine();

            int sum = numOne + numTwo + numThree;
            System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);
        }
}

