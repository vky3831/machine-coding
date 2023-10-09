package DesignPattern.CompositePattern;

public class PlayComposite {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder study = new Folder("study");
        Folder entertainment = new Folder("entertainment");
        Folder movies = new Folder("movies");
        Folder games = new Folder("games");
        File inception = new File("Inception.mov");
        File theDarkKnight = new File("The_Dark_Knight.mov");
        File gta5 = new File("GTA_V.exe");
        File DSAnotes = new File("DSA_notes.txt");

        root.addComponent(study);
        root.addComponent(entertainment);
        entertainment.addComponent(movies);
        entertainment.addComponent(games);
        movies.addComponent(inception);
        movies.addComponent(theDarkKnight);
        games.addComponent(gta5);
        study.addComponent(DSAnotes);

        root.print();
    }

}
