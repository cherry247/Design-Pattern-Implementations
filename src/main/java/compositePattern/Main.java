package compositePattern;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("edit.jpg");
        Folder documents = new Folder("documents");
        Folder images = new Folder("images");
        documents.add(file1);
        images.add(file2);
        Folder root = new Folder("root");
        root.add(documents);
        root.add(images);
        root.showDetails();
    }
}
