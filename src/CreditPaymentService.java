public class CreditPaymentService {
    public double calculate(int loanAmount, double interestRate, int period) {
        double ratePerMonth = (interestRate / 12) / 100;
        double i = 1 + ratePerMonth;
        double n = Math.pow(i, period * 12);
        double annuityFactor = (ratePerMonth * n) / (n - 1);
        double payment = loanAmount * annuityFactor;
        return payment;
    }
}
