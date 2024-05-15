package State;

public class IdleState extends State {

    IdleState(ATM atm) {
        super(atm);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Unsupported method 'withdraw'");
    }

    @Override
    public boolean enterPin(int pin) {
        this.atm.setState(new AuthorizedState(this.atm));
        return true;
    }

}
