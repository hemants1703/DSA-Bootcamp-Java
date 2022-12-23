import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  declared the points storing variables
        double x1, y1,
                x2, y2;

        //  input coordinates of the first point
        System.out.println("Enter the coordinates of the first point - ");
        System.out.print("x1: ");
        x1 = sc.nextDouble();
        System.out.print("y1: ");
        y1 = sc.nextDouble();

        //  input coordinates of the second point
        System.out.println("Enter the coordinates of the second point - ");
        System.out.print("x2: ");
        x2 = sc.nextDouble();
        System.out.print("y2: ");
        y2 = sc.nextDouble();

        //  calculating distance between the two points
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        //  output the distance
        System.out.println("The distance between the points: " + distance);
    }
}
