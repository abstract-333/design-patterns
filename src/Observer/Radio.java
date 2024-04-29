package Observer;

public class Radio implements Client {
    String clientName;

    public Radio(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void publishNews(String news) {
        System.out.println(this.clientName + ": " + news);
    }

}
