public class CreditPaymentService {
    public float calculate(double interestRate, int creditAmount, int creditTerm) {
        double monthInterestRate = interestRate/100/12;
        double x = 1+monthInterestRate;
        double monthPayment = creditAmount*monthInterestRate/(1 - Math.pow(x, -creditTerm));

        return (int) monthPayment;
    }
}
