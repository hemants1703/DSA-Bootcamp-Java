import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter " + n + " elements");

        //  input n elements and sum up all of them
        for(int i = 0; i < n; i++)
            sum += sc.nextInt();

        //  calculating average
        double average = sum / n;

        System.out.println("The average of " + n + " numbers: " + average);
    }
}
