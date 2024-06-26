package Iterator.Radio;

import java.util.ArrayList;

public class Radio {
    private ArrayList<Channel> channels = new ArrayList<>();

    public void addChannel(Channel channel) {
        this.channels.add(channel);

    }

    public void deleteChannel(int channelID) {
        this.channels.remove(channelID);
    }

    ArrayList<Channel> getChannels() {
        return this.channels;
    }

    Iterator getChannelTypeIterator(ChannelType type) {
        return new ChannelTypeIterator(this, type);
    }
}
