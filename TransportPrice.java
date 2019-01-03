import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double sum = 0;

        if(num < 20 && timeOfDay.equals("day")){
            sum = (num*0.79)+0.70;
        } else if(num < 20 && timeOfDay.equals("night")){
            sum = (num*0.90)+0.70;
        }else if((num >=20 && num < 100)&& timeOfDay.equals("day")){
            sum = num*0.09;
        }else if((num >=20 && num < 100)&& timeOfDay.equals("night")) {
            sum = num * 0.09;
        }else if((num >= 100 && timeOfDay.equals("day"))){
            sum = num*0.06;
        } else if((num >= 100 && timeOfDay.equals("night"))){
            sum = num*0.06;
        }

        System.out.printf("%.2f",sum);
    }
}
