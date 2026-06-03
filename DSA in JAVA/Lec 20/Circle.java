

public class Circle extends Shape {

    @Override
    public void draw(){
        System.out.println("Circle drawing");
    }
}

abstract class Shape {
    public abstract void draw();
}
