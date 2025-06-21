package statePattern;

public class Draft implements State{
    @Override
    public void publish(Document doc){
        System.out.println("Publishing document from Draft state.");
        doc.setState(new Moderation());
    }

    @Override
    public void revert(Document doc) {
        System.out.println("Cannot revert from Draft state.");
    }
}
