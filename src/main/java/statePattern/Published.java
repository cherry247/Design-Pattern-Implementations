package statePattern;

public class Published implements State {

    @Override
    public void publish(Document doc) {
        System.out.println("Document is already published.");
    }

    @Override
    public void revert(Document doc) {
        System.out.println("Reverting document from Published state to Moderation.");
        doc.setState(new Moderation());
    }
}
