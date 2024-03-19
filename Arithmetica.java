package practice;

import java.util.*;

public class Arithmetica {
    public static void main(String[] args) {
        int a, b, sum, difference, product, quotient, remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();

        sum = a + b;
        difference = a - b;
        product = a * b;

        if (b != 0) {
            quotient = a / b;
            remainder = a % b;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
