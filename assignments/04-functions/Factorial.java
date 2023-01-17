import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        if(number >= 0)
            System.out.println("Factorial: " + factorial(number));
        else
            System.out.println("Invalid Input");
    }
    private static int factorial(int number) {
        if(number == 0)
            return 1;
        else if(number == 1)
            return 1;
        else {
            int factorial = 1;
            for(int i = number; i >= 1; i--)
                factorial *= i;
            return factorial;
        }
    }
}
