package State;

public class AuthorizedState extends State {
    AuthorizedState(ATM atm) {
        super(atm);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("CASH: " + amount);
        this.atm.setState(new IdleState(this.atm));
    }

    @Override
    public boolean enterPin(int pin) {
        throw new UnsupportedOperationException("Unsupported method 'enterPin'");

    }

}
