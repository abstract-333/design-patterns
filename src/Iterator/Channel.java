package Iterator;

public class Channel {
    private String name;
    private double frequency;
    private ChannelType type;

    public Channel(String name, double frequency, ChannelType type) {
        this.name = name;
        this.frequency = frequency;
        this.type = type;
    }

    ChannelType getType() {
        return this.type;
    }

    double getFrequency() {
        return this.frequency;
    }

    String getName() {
        return this.name;
    }
}
