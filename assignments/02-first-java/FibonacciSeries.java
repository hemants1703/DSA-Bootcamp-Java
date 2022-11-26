//  To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input n
        System.out.print("Enter the length for the series: ");
        int n = scan.nextInt();

        //  printing the series up to n values
        int a = 0, b = 1, c;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
