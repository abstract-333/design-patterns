package Proxy;

public class CreditCard implements IPayment {
    private float debt;
    private float debtLimit;

    public CreditCard(float debtLimit) {
        this.debt = 0;
        this.debtLimit = debtLimit;
    }

    @Override
    public void pay(String receiver, float amount) {
        if (amount + debt > debtLimit) {
            System.out.println("You are reached debt limit");
            return;
        }
        debt += amount;
        System.out.println("Receiver " + receiver + " amount: " + amount);
    }

}
