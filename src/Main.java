import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a credit amount");
        int sum = in.nextInt();
        System.out.println("Enter a credit time in months");
        int timeMonth = in.nextInt();
        System.out.println("Enter an interest rate");
        double percent = in.nextDouble();

        System.out.println("Your monthly payment is " + service.calculate(sum, timeMonth, percent));
    }
}