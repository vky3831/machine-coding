package DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    String name;
    List<FileSystemComponent> components;

    Folder(String name){
        this.name = name;
        components = new ArrayList<>();
    }

    void addComponent(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("Folder:" + name);
        for(FileSystemComponent component : components){
            component.print();
        }
    }
}
