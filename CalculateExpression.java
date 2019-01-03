import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double sum = Math.pow((a*a + b*b)/((a*a - b*b)),(a+b+c)/Math.sqrt(c));
        double sumTwo = Math.pow((a*a + b*b - c*c*c),(a - b));

        double sumAverage = (a+b+c)/3;
        double sumTwoAverage = (sum+sumTwo)/2;
        double diff = Math.abs(sumAverage-sumTwoAverage);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", sum, sumTwo, diff);

    }
}
