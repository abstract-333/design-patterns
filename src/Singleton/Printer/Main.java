package Singleton.Printer;

public class Main {
    public static void main(String[] args) throws Exception {
        Printter p1 = Printter.getInstace();
        Printter p2 = Printter.getInstace();
        Printter p3 = Printter.getInstace();

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
