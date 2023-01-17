import java.util.Scanner;

public class FunctionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Enter first number: ");
        firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();
        System.out.println("The summation of the two number: " + summation(firstNumber, secondNumber));
    }
    private static int summation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
