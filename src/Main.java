public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1 = service.calculate(9.99, 1_000_000, 12);
        double monthlyPayment2 = service.calculate(9.99, 1_000_000, 24);
        double monthlyPayment3 = service.calculate(9.99, 1_000_000, 36);

        System.out.println("Ежемесячный платеж " + monthlyPayment1);
        System.out.println("Ежемесячный платеж " + monthlyPayment2);
        System.out.println("Ежемесячный платеж " + monthlyPayment3);
    }
}
