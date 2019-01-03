import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double input = Double.parseDouble(scanner.nextLine());

        double wurstBGN = (input*1.20);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal endValue = new BigDecimal(wurstBGN).multiply(exchangeRate);

       endValue =  endValue.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(endValue + " " + "marks");


    }
}
