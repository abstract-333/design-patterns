package Proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        IPayment creditCard = new CreditCard(100);
        IPayment debitCard = new DebitCard(100);

        debitCard.pay("H&M", 90);
        creditCard.pay("H&M", 90);

        debitCard.pay("H&M", 30);
        creditCard.pay("H&M", 30);
    }
}
