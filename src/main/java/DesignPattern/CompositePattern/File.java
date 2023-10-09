package DesignPattern.CompositePattern;

import java.util.List;

public class File implements FileSystemComponent {
    String name;

    File(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("File: " + name);
    }
}
