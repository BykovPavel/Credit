public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        double interestRate = 9.99;
        int mounthlyPayment1 = (int) service.calculate(loanAmount, interestRate, 1);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год= " + mounthlyPayment1 + "р");
        int mounthlyPayment2 = (int) service.calculate(loanAmount, interestRate, 2);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года= " + mounthlyPayment2 + "р");
        int mounthlyPayment3 = (int) service.calculate(loanAmount, interestRate, 3);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года= " + mounthlyPayment3 + "р");
    }


}
