package Week04.Exercise03;

import java.util.Arrays;

/**
 * Created by Miguel Emmara
 */
public class NumberList {
    private final int[] listOfInteger = new int[10];

    public NumberList() {
        Arrays.fill(listOfInteger, 0);
    }

    public int size() {
        return this.listOfInteger.length;
    }

    private boolean valid(int i) {
        return i <= listOfInteger.length;
    }

    public void update(int index,int value) {
        if (valid(index)) {
            this.listOfInteger[index] = value;
        }
    }

    public int min() {
        int res = this.listOfInteger[0];

        for (int i = 1; i < this.listOfInteger.length; i++)
            res = Math.min(res, this.listOfInteger[i]);
        return res;
    }

    public int max() {
        int res = this.listOfInteger[0];

        for (int i = 1; i < this.listOfInteger.length; i++)
            res = Math.max(res, this.listOfInteger[i]);
        return res;
    }

    public int[] nonZero() {
        return Arrays.stream(this.listOfInteger).filter(i -> i != 0).toArray();
    }

    public double average() {
        int sum = 0;
        for (int j : this.listOfInteger) sum += j;
        return (double)sum / this.listOfInteger.length;
    }

    public int getNumber(int i) {
        return this.listOfInteger[i-1];
    }

    public void absolute() {
        for (int i = 0; i < this.listOfInteger.length; i++) {
            this.listOfInteger[i] = Math.abs(this.listOfInteger[i]);
        }
    }

    public void scale (int f) {
        for (int i = 0; i < this.listOfInteger.length; i++) {
            this.listOfInteger[i] = this.listOfInteger[i] * f;
        }
    }

    /*public NumberList sub(int startIndex,int endIndex) {

    }*/

    @Override
    public String toString() {
        return Arrays.toString(listOfInteger);
    }
}
