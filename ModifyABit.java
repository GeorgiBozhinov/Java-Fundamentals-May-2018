import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int bitValue = scanner.nextInt();

        if (bitValue == 0){
            int mask = ~(1 << p);
            int result = n & mask;
            System.out.println(result);
        }else{
            int mask = 1 << p;
            int result = n | mask;
            System.out.println(result);
        }

    }
}
