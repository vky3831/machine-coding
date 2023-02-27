package DesignPattern.AdapterPattern;

public class BetterPenAdapter implements Pen{
    BetterPen bpen = new BetterPen();
    BetterPenAdapter(BetterPen bpen){
        this.bpen = bpen;
    }
    @Override
    public void write(String str) {
        bpen.mark(str);
    }
}
