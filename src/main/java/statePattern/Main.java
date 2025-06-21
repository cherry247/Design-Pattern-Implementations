package statePattern;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document(new Draft());
       doc.publish();
       doc.revert();
       doc.publish();
       doc.publish();
       doc.revert();
       doc.revert();
       doc.revert();
    }
}
