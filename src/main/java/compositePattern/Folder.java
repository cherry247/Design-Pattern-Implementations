package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for(FileSystem fileSystem: children){
            fileSystem.showDetails();
        }
    }
}
