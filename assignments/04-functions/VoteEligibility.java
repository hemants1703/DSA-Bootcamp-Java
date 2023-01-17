import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the age of the candidate: ");
        age = sc.nextInt();
        if(eligibilityCheck(age))
            System.out.println("The candidate is eligible to vote");
        else
            System.out.println("The candidate is ineligible to vote");
    }
    private static boolean eligibilityCheck(int age) {
        return age >= 18;
    }
}
