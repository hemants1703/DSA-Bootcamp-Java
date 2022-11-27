//  Area Of Triangle
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input base and height
        System.out.print("Enter the base: ");
        double base = scan.nextDouble();
        System.out.print("Enter the height: ");
        double height = scan.nextDouble();

        //  calculate area of triangle
        double area = 0.5 * base * height;

        //  output area of triangle
        System.out.println("Area of triangle: " + area);
    }
}
