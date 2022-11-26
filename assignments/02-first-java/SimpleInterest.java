//  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input principal P
        System.out.print("Enter Principal: ");
        int P = scan.nextInt();

        //  input time T
        System.out.print("Enter Time: ");
        int T = scan.nextInt();

        //  input rate R
        System.out.print("Enter Rate: ");
        int R = scan.nextInt();

        //  calculate SI
        double SI = (P * R * T) / 100;

        //  output SI
        System.out.println("Simple Interest: " + SI);
    }
}
