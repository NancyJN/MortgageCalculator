import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte months = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal amount : ");
        int principalAmount = scanner.nextInt();

        System.out.println("Annual Interest Rate is :");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / months ;

        System.out.println("Enter the period :");
        int periodOfTime = scanner.nextInt();
        int numberOfpayments = periodOfTime * months ;

        double mortgage = principalAmount * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfpayments))/
                (Math.pow(1+ monthlyInterest,numberOfpayments)-1);

        System.out.println(NumberFormat.getCurrencyInstance().format(+mortgage));



    }
}
