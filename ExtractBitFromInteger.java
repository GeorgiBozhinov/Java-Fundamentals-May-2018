import java.util.Scanner;

public class ExtractBitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

       int mask =  numOne >> numTwo;
       int result = 1 & mask;
        System.out.println(result);

    }
}
