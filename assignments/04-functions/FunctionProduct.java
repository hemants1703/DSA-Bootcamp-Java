import java.util.Scanner;

public class FunctionProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber, secondNumber;
        System.out.print("Enter the first number: ");
        firstNumber = sc.nextDouble();
        System.out.print("Enter the second number: ");
        secondNumber = sc.nextDouble();
        System.out.println("The product of the two numbers: " + product(firstNumber, secondNumber));
    }
    private static double product(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
