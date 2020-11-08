public class Main {
    public static void main (String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneYearMonthlyPayment = service.calculate(1_000_000, 1, 9.99);
        System.out.println(oneYearMonthlyPayment);

        int twoYearMonthlyPayment = service.calculate(1_000_000, 2, 9.99);
        System.out.println(twoYearMonthlyPayment);

        int threeYearMonthlyPayment = service.calculate(1_000_000, 3, 9.99);
        System.out.println(threeYearMonthlyPayment);
    }
}
