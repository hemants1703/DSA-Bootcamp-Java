import java.util.*;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.print("Enter start range: ");
        start = sc.nextInt();
        System.out.print("Enter end range: ");
        end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) 
                System.out.print(i + " ");
        }
    }
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) 
            return false;
        if (number == 2) 
            return true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) 
                return false;
        }
        return true;
    }
}
