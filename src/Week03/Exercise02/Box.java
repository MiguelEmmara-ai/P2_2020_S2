package Week03.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Box {
    private int height;
    private int width;
    private int depth;
    private boolean full;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return "Box\n" +
                "height: " + height +
                ", width: " + width +
                ", depth: " + depth +
                ", full: " + full;
    }
}
