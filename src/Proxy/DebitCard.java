package Proxy;

public class DebitCard implements IPayment {
    private float balance;

    public DebitCard(float balance) {
        this.balance = balance;
    }

    @Override
    public void pay(String receiver, float amount) {
        if (amount > balance) {
            System.out.println("Not enough balance to make the payment ");
            return;
        }
        balance -= amount;
        System.out.println("Receiver " + receiver + " amount: " + amount);
    }

}
