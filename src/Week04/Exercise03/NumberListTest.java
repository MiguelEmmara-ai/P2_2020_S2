package Week04.Exercise03;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Miguel Emmara
 */
public class NumberListTest {
    public static void main(String[] args) {
        Random r = new Random();
        NumberList numberList = new NumberList();

        for (int i = 0; i < 10; i++) {
            numberList.update(i, r.nextInt(100) + -50);
        }

        System.out.println("NumberList Array");
        System.out.println(numberList);
        System.out.println("Size: " + numberList.size());
        System.out.println("Min: " + numberList.min());
        System.out.println("Max: " + numberList.max());
        System.out.println("Average: " + numberList.average());
        int randomValue = r.nextInt(10) + 1;
        System.out.println("Get the " + randomValue + "th Value: " + numberList.getNumber(randomValue));
        System.out.println("Non zero: " + Arrays.toString(numberList.nonZero()));
        System.out.print("Absolute Value: ");
        numberList.absolute();
        System.out.println(numberList);
        System.out.print("Scale by 2: ");
        numberList.scale(2);
        System.out.println(numberList);
    }
}
