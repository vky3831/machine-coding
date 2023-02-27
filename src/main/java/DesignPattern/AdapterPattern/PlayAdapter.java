package DesignPattern.AdapterPattern;

public class PlayAdapter {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        BetterPenAdapter pen = new BetterPenAdapter(new BetterPen());
//        aw.setPen(new BetterPen()); // We want to use BetterPen but since WriteAssignment class only accepts Pen hence we have created BetterPenAdapter
        aw.setPen(pen);
        aw.writeAssignment("Done and Dusted");
    }
}
