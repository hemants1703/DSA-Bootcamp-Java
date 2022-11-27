//  Fibonacci Series In Java Programs
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input length of series
        System.out.print("Enter the length of the series: ");
        long length = scan.nextLong();

        //  print series up to specified length
        long firstTerm = 0, secondTerm = 1, nextTerm;
        for(int i = 0; i < length; i++) {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
