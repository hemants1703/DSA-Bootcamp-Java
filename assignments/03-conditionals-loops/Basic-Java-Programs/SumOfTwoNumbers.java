//  Addition Of Two Numbers
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input first number
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();

        //  input second number
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();

        //  summation of two numbers
        int sum = firstNumber + secondNumber;

        //  output summation
        System.out.println("Sum Of Two Numbers: " + sum);
    }
}
