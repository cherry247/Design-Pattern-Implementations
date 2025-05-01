package observerPattern;

public interface Subject {
    void addObserver(Observers observer);
    void removeObserver(Observers observer);
    void notifyObservers();
}
