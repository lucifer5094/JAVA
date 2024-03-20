package practice;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        int max = (x > y) ? (x > z) ? x : y : (y > z) ? y : z;
        System.out.println("max: " + max);
    }
}
