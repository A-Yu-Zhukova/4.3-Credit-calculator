import java.lang.Math;

public class CreditPaymentService {
    public int calculate (int amount, int year, double rateYear) {
        int month = year * 12;
        double rateMonth = rateYear / 12.0 / 100.0;
        double coefficient = rateMonth * Math.pow(1 + rateMonth, month) / (Math.pow (1 + rateMonth, month) - 1);
        double monthlyPayment = coefficient * amount;
        return (int)monthlyPayment;
    }
}
