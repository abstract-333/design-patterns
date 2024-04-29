package Observer;

public class Main {
    public static void main(String[] args) throws Exception {
        Radio sham = new Radio("Sham FM");
        TV sawa = new TV("Sawa TV");

        NewsService topNewsService = new NewsService("Top News");

        topNewsService.register(sawa);
        topNewsService.register(sham);

        topNewsService.addNews("Exam");
    }
}
