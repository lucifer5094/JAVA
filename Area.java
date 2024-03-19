package practice;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        float radius, length,breadth, size, are_cirlcle, are_rectangle, are_square;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextFloat();
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = input.nextFloat();
        System.out.print("Enter the size of the square: ");
        size = input.nextFloat();
        are_cirlcle = (float) (3.14*radius*radius);
        are_rectangle = (float)(length*breadth);
        are_square = (float)(size*size);
        System.out.println("Area of the circle: "+are_cirlcle);
        System.out.println("Area of the rectangle: "+are_rectangle);
        System.out.println("Area of the square: "+are_square);
    }
}
