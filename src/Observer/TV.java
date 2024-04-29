package Observer;

public class TV implements Client {
    String clientName;

    public TV(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void publishNews(String news) {
        System.out.println(this.clientName + ": " + news);
    }

}
