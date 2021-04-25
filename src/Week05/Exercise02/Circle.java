package Week05.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Circle extends Shape {
    private final double PI = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return this.PI * this.radius * this.radius;
    }
}
