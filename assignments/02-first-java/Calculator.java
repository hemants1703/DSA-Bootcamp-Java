//  Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input the two numbers

        //  input the first number
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();

        //  input the second number
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();

        //  input the operator
        System.out.print("Enter any one of (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        double result = 0.0;

        //  conditionals for checking the operator for valid calculation
        if(operator == '+')
            result = firstNumber + secondNumber;
        else if(operator == '-')
            result = firstNumber - secondNumber;
        else if(operator == '*')
            result = firstNumber * secondNumber;
        else if(operator == '/')
            result = firstNumber / secondNumber;
        else
            System.out.println("Invalid Input!");

        //  output the result
        System.out.println("Result: " + result);
    }
}
