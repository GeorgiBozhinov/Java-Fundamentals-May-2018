import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String hex = Integer.toHexString(a);
        String binary = Integer.toString(a, 2);

        int hexSpaces = 10 - hex.length();
        // int binaryLength = 10 - binary.length();

        int n = 6;
        String s = String.format("%1$"+n+"s", "");

        System.out.println(s);
        //System.out.printf("|%s%hexSpaces|%s|     %.2f|%.3f     |", hex.toUpperCase(),
        //0, binary, b, c);

        //System.out.printf("|%s" +"%1$"+ hexSpaces + "s", hex.toUpperCase(), "");

    }
}
