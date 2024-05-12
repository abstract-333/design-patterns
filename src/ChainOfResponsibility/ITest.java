package ChainOfResponsibility;

public interface ITest {
    public void setNext(ITest next);

    public void test(Product product);
}
