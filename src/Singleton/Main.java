package Singleton;

public class Main {
    public static void main(String[] args) throws Exception {
        Singleton firstInstance = Singleton.getInstance();

        Singleton secondInstance = Singleton.getInstance();

        Singleton thidInstance = Singleton.getInstance();

        System.out.println("Hashcode of x is "
                + firstInstance.hashCode());

        System.out.println("Hashcode of y is "
                + secondInstance.hashCode());

        System.out.println("Hashcode of z is "
                + thidInstance.hashCode());
    }
}
