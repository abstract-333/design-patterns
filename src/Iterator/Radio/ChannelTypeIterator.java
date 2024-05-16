package Iterator.Radio;

import java.util.ArrayList;

public class ChannelTypeIterator implements Iterator {
    private int curretIndex = 0;
    private Radio radio;
    private ChannelType type;

    public ChannelTypeIterator(Radio radio, ChannelType type) {
        this.radio = radio;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        ArrayList<Channel> channels = radio.getChannels();
        for (int index = curretIndex; index < channels.size(); index++) {
            if (channels.get(index).getType() == this.type) {
                this.curretIndex = index;
                return true;
            }

        }
        return false;
    }

    @Override
    public Channel next() {
        ArrayList<Channel> channels = radio.getChannels();
        Channel nextChannel = channels.get(curretIndex);
        curretIndex++;
        return nextChannel;
    }

    @Override
    public void reset() {
        this.curretIndex = 0;
    }

}
