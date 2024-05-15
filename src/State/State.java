package State;

abstract public class State {
    protected ATM atm;

    public State(ATM atm) {
        this.atm = atm;
    }

    public abstract void withdraw(double amount);

    public abstract boolean enterPin(int pin);

}
