package Week05.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog object instantiated!");
        this.happy = 10;
    }

    public void feed() {
        this.eat += 5;
        this.happy += 1;
    }

    public String toString() {
        return "Dog has " + super.toString();
    }
}