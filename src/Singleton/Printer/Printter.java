package Singleton.Printer;

public class Printter {
    private static Printter instance;

    private Printter() {
        System.out.println("Constructer");
    }

    public static synchronized Printter getInstace() {
        if (instance == null) {

            instance = new Printter();
        }
        return instance;
    }
}
