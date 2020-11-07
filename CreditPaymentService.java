import java.lang.Math;

public class CreditPaymentService {
    public int calculate (int amount, int year) {
        int month = year * 12;
        double rateYear = 9.99;
        double rateMonth = rateYear / 12.0 / 100.0;
        double coefficient = rateMonth * Math.pow(1 + rateMonth, month) / (Math.pow (1 + rateMonth, month) - 1);
        double monthlyPayment = coefficient * amount;
        return (int)monthlyPayment;
    }
    //K = i * (1 + i)n / ((1 + i)n - 1), где:
    //i — месячная процентная ставка (годовая ставка / 12 / 100);
    //n — количество месяцев, в течение которых выплачивается кредит.
}
