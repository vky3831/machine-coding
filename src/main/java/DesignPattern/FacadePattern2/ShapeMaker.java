package DesignPattern.FacadePattern2;

/*
* Facade pattern hides the complexities of the system and provides an interface to the client using which the client can
*  access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to
* existing system to hide its complexities.
* */
public class ShapeMaker { // Facade
    private Square square;
    private Triangle triangle;
    private Circle circle;

    ShapeMaker(){
        square = new Square();
        triangle = new Triangle();
        circle = new Circle();
    }

    void drawSquare(){
        square.draw();
    }

    void drawTriangle(){
        triangle.draw();
    }

    void drawCircle(){
        circle.draw();
    }
}
