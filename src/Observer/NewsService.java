package Observer;

import java.util.ArrayList;

public class NewsService {
    String serviceName;
    ArrayList<Client> clients = new ArrayList<Client>();
    ArrayList<String> news = new ArrayList<String>();

    public NewsService(String serviceName) {
        this.serviceName = serviceName;
    }

    void register(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);

        }
    }

    void addNews(String news) {
        this.news.add(news);
        this.notify(news);
    }

    void notify(String news) {
        for (Client client : this.clients) {
            client.publishNews(news);
        }
    }
}
