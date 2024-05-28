package Strategy;

public class Walking implements RouteStrategy {

    @Override
    public void find(Location loc1, Location loc2) {
        System.out.println("Walking from " + loc1.toString() + " to " + loc2.toString());
    }

}
