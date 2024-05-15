package State;

public class Main {
    public static void main(String[] args) throws Exception {
        ATM atm = new ATM();
        atm.enterPin(123);
        atm.withdraw(100);
        atm.withdraw(100);

    }
}
