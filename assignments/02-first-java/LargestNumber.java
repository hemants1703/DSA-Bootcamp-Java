//  Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input first number
        System.out.print("Enter first number: ");
        long firstNumber = scan.nextInt();

        //  input second number
        System.out.print("Enter second number: ");
        long secondNumber = scan.nextInt();

        //  conditionals to find the largest number and output accordingly
        if(firstNumber > secondNumber)
            System.out.println("The largest number: " + firstNumber);
        else
            System.out.println("The largest number: " + secondNumber);
    }
}
