package DesignPattern.FacadePattern2;

public class PlayFacade2 {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawTriangle();
    }
}
