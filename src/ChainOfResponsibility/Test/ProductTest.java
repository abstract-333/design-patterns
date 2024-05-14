package ChainOfResponsibility.Test;

public class ProductTest implements ITest {
    private ITest next;

    public ProductTest() {
        this.next = null;
    }

    @Override
    public void setNext(ITest next) {
        this.next = next;
    }

    @Override
    public void test(Product product) {
        if (next != null) {
            next.test(product);
        } else {
            System.out.println(product.getName() + " is a good product");
        }
    }

}