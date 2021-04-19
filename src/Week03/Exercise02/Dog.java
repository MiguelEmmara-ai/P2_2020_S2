package Week03.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int personYear() {
        return getDogAge() * 7;
    }

    @Override
    public String toString() {
        return "Dog name is " + getDogName() + ", Dog age is " + getDogAge() + " Years old, Dog age is equal to " + personYear() +
                " years old in person age";
    }
}
