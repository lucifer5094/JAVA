package practice;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = input.nextInt();
        System.out.println("x: " + x);
        System.out.println("x += 5: " + (x += 5));
        System.out.println("x: " + x);
        System.out.println("x -= 5: " + (x -= 5));
        System.out.println("x: " + x);
        System.out.println("x *=5: " + (x *= 5));
        System.out.println("x: " + x);
        System.out.println("x /=5: " + (x /= 5));
        System.out.println("x: " + x);
        System.out.println("x %= 5: " + (x %= 5));
        System.out.println("x: " + x);
        System.out.println("x &= 0b1010: " + (x &= 0b1010));
        System.out.println("x: " + x);
        System.out.println("x |= 0b1010: " + (x |= 0b1010));
    }
}
