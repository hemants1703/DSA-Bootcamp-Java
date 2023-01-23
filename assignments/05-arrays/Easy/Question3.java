import java.util.Arrays;
//  https://leetcode.com/problems/running-sum-of-1d-array/
public class Question3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            nums[i] = runningSum;
        }
        return nums;
    }
}
