package Strategy;

public class Main {
    public static void main(String[] args) throws Exception {
        Navigator routeStrategy = new Navigator(new Cycling());
        routeStrategy.findRoute(new Location(10, 20), new Location(20, 30));
    }
}