package Strategy;

public class Cycling implements RouteStrategy {

    @Override
    public void find(Location loc1, Location loc2) {
        System.out.println("Cycling from " + loc1.toString() + " to " + loc2.toString());
    }

}
