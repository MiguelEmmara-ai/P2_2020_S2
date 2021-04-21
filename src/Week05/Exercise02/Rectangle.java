package Week05.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return this.length * this.width;
    }
}
