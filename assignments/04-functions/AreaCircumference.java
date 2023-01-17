import java.util.Scanner;

public class AreaCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        System.out.println("The Circumference of the Circle: " + circumference(radius));
        System.out.println("The Area of the Circle: " + area(radius));
    }
    private static double area(double radius) {
        return 3.14 * radius * radius;
    }
    private static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }
}
