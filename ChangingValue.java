package practice;

import java.util.*;

public class ChangingValue {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        System.out.print("Initially\n");
        System.out.println("x: " + x + "     y: " + y);
        y = 20;
        System.out.print("After y = 20\n");
        System.out.println("x: " + x + "     y: " + y);

        System.out.println("--------------------------------");
        int[] a  = {1, 2, 3, 4, 5};
        int[] b = a;
        System.out.print("Initially\n");
        System.out.println("a: " + Arrays.toString(a) + "     b: " + Arrays.toString(b));
        b[3] = 69;
        System.out.print("After b[3] = 69\n");
        System.out.println("a: " + Arrays.toString(a) + "     b: " + Arrays.toString(b));
    }
}
