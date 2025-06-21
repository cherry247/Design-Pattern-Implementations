package statePattern;

public interface State {
    void publish(Document doc);
    void revert(Document doc);
}
