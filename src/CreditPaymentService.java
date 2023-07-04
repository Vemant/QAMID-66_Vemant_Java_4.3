import java.lang.Math;
public class CreditPaymentService {
    public int calculate (int s, int t, double p) {
        double kHelp = 1 + p / (12 * 100);
        double kAnn = p / (12 * 100) * Math.pow(kHelp, t) / (Math.pow(kHelp, t) - 1);
        double paymentMonth = s * kAnn;
        return (int) paymentMonth;
    }
}
