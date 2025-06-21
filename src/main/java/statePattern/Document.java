package statePattern;

public class Document {
    private State state;
    public Document(State state) {
        this.state = state;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void publish() {
       state.publish(this);
    }
    public void revert() {
       state.revert(this);
    }
}
