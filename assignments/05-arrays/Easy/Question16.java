//  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Question16 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for(int i: nums) {
            if(digitCount(i))
                evenDigitCount++;
        }
        return evenDigitCount;
    }
    public static boolean digitCount(int number) {
        //  this function returns true if the number contains even number of digits
        int countDigits = 0;
        while(number > 0) {
            countDigits++;
            number /= 10;
        }
        return countDigits % 2 == 0;
    }
}
