import java.util.Scanner;

public class FunctionPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        if(primeCheck(number))
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }
    private static boolean primeCheck(int number) {
        if (number <= 1)
            return false;
        else if (number == 2)
            return true;
        else if (number % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
