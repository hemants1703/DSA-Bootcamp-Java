//  Area Of Equilateral Triangle
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input side for the triangle
        System.out.print("Enter one side: ");
        double side = scan.nextDouble();

        //  calculate Area Of Equilateral Triangle
        double area = Math.sqrt(3) / 4 * side * side;

        //  output area
        System.out.println("Area Of Equilateral Triangle: " + area);
    }
}
