package Strategy;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitud() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String toString() {
        return "(" + latitude + "," + longitude + ")";
    }
}
