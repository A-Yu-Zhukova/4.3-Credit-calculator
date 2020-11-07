public class Main {
    public static void main (String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneYearMonthlyPayment = service.calculate(1_000_000, 1);
        System.out.println(oneYearMonthlyPayment);

        int twoYearMonthlyPayment = service.calculate(1_000_000, 2);
        System.out.println(twoYearMonthlyPayment);

        int threeYearMonthlyPayment = service.calculate(1_000_000, 3);
        System.out.println(threeYearMonthlyPayment);
    }
}
