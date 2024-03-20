package practice;

import java.util.*;
import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = input.nextInt();
        System.out.println("postincrement: " + (x++));
        System.out.println("preincrement: " + (++x));
        System.out.println("postdecrement: " + (x--));
        System.out.println("predecrement: " + (--x));
    }

}
