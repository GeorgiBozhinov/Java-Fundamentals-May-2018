import java.math.BigInteger;
        import java.util.Scanner;

public class ProductsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        BigInteger sum = BigInteger.ONE;

        for(int i = numOne; i <= numTwo; i++){
            sum  = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("product[%d..%d] = %d ",numOne,numTwo,sum);
    }
}
