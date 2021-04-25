package Week05.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Cat extends Animal {
    public Cat() {
        System.out.println("Cat object instantiated!");
        this.happy = -10;
    }

    public void feed() {
        this.eat += 1;
        this.happy += 10;
    }

    public String toString() {
        return "Cat has " + super.toString();
    }
}