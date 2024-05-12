package ChainOfResponsibility;

public class Test extends ProductTest {
    private String invalidName;
    private String testName;

    public Test(String invalidName, String testName) {
        super();
        this.invalidName = invalidName;
        this.testName = testName;
    }

    @Override
    public void test(Product product) {
        if (product.getName() == this.invalidName) {
            System.out.println(this.testName + " failed: " + product.getName());
            System.out.println(product.getName() + " is a bad product");

        } else {
            System.out.println(this.testName + " success: " + product.getName());
            super.test(product);
        }
    }

}
