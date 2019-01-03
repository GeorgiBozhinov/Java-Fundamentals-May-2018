import java.util.Scanner;

public class MagicExchangeanbleWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");

        if (tokens[0].length() != tokens[1].length()) {
            System.out.println("false");
        }
    }
}
