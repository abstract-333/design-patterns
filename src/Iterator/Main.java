package Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        Channel shamFm = new Channel("Sham FM", 191, ChannelType.Arabic);
        Channel RT = new Channel("RT", 182.03, ChannelType.Both);
        Channel CNN = new Channel("CNN", 111.07, ChannelType.English);
        Channel DW = new Channel("DW", 123.9, ChannelType.English);

        Radio radio = new Radio();
        radio.addChannel(CNN);
        radio.addChannel(shamFm);
        radio.addChannel(RT);
        radio.addChannel(DW);

        Iterator englishTypeIterator = radio.getChannelTypeIterator(ChannelType.English);
        while (englishTypeIterator.hasNext()) {
            System.out.println(englishTypeIterator.next().getName());
        }
    }
}
