package Week03.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Sphere {
    private int diameter;
    private static final double pie = 3.14285714286;

    public Sphere(int diameter) {
       setDiameter(diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double calculateVolume() {
        int radius = getDiameter() / 2;
        return (4.0/3.0) * pie *(radius * radius * radius);
    }

    public double calculateSurfaceArea() {
        int radius = getDiameter() / 2;
        return 4 * pie * (radius * radius);
    }

    @Override
    public String toString() {
        String str = "";

        str += "\nSphere diameter: " + getDiameter() + "\n";
        str += "Volume: " + calculateVolume();
        str += "\nSurface: " + calculateSurfaceArea();

        return str;
    }
}
