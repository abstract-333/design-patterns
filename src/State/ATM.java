package State;

public class ATM {
    private State state;

    public ATM() {
        this.state = new IdleState(this);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public boolean enterPin(int pin) {
        return state.enterPin(pin);
    }

    public void setState(State state) {
        this.state = state;
    }
}