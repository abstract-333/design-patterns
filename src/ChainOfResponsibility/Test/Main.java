package ChainOfResponsibility.Test;

public class Main {
    public static void main(String[] args) throws Exception {
        Product s24 = new Product("S24");
        Product s24Ultra = new Product("S24 Ultra");

        ITest test1 = new Test("S24", "First Test");
        ITest test2 = new Test("S24 Plus", "Second Test");
        ITest test3 = new Test("S23", "Third Test");

        test2.setNext(test3);
        test1.setNext(test2);

        test1.test(s24Ultra);
        test1.test(s24);
    }
}
