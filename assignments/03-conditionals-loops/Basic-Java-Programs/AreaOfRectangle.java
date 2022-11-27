//  Area Of Rectangle Program
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input length and breadth
        System.out.print("Enter length: ");
        double length = scan.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scan.nextDouble();

        //  calculate area of rectangle
        double area = length * breadth;

        //  output area of rectangle
        System.out.println("Area of Rectangle: " + area);
    }
}
