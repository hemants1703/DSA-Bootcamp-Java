//  Area Of Isosceles Triangle
import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input base
        System.out.print("Enter base: ");
        double base = scan.nextDouble();

        //  input equal sides
        System.out.print("Enter side: ");
        double side = scan.nextDouble();

        //  calculating area of an isosceles triangle with equal sides as per NCERT 2018
        double area =  base / 4 * Math.sqrt(4 * side * side - base * base);

        //  output area of isosceles triangle
        System.out.println("Area Of Isosceles Triangle: " + area);
    }
}
