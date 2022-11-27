//  Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input number
        System.out.print("Enter the number: ");
        int number = scan.nextInt();

        //  calculating factorial
        int factorial = 1;
        for(int i = 1; i <= number; i++)
            factorial *= i;

        //  output factorial
        System.out.println("Factorial: " + factorial);
    }
}
