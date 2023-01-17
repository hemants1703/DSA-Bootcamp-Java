import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        if(number > 0)
            printSum(number);
        else
            System.out.println("Invalid Input");
    }
    private static void printSum(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++)
            sum += i;
        System.out.println("The sum of " + number + " natural numbers: " + sum);
    }
}
