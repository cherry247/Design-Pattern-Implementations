package statePattern;

public class Moderation implements State{

        @Override
        public void publish(Document doc) {
            System.out.println("Approving content in Moderation state. Document is now published.");
            doc.setState(new Published());
        }

        @Override
        public void revert(Document doc) {
            System.out.println("Reverting document from Moderation state to Draft.");
            doc.setState(new Draft());
        }
}
