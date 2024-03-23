package Collection;

import java.util.Random;

/* random class is use for generating random number in java */
public class RandomClass {
    public static void main(String[] args) {
Random object = new Random();
int x= object.nextInt();
        System.out.println(x);
        int y = object.nextInt(100);
        System.out.println(y);

    }
}
