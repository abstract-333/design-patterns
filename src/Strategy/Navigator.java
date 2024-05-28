package Strategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void findRoute(Location start, Location end) {
        routeStrategy.find(start, end);
    }
}
