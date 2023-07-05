import java.lang.Math;

public class CreditPaymentService {
    public int calculate(int sum, int time, double percent) {
        double coftHelp = 1 + percent / (12 * 100);
        double coftAnnuit = percent / (12 * 100) * Math.pow(coftHelp, time) / (Math.pow(coftHelp, time) - 1);
        double paymentMonth = sum * coftAnnuit;
        return (int) paymentMonth;
    }
}
