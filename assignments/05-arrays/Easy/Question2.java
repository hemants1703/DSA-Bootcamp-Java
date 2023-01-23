import java.util.Arrays;
//  https://leetcode.com/problems/concatenation-of-array/
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i = 0, a = 0; i < (2 * nums.length); i++) {
            if(a < nums.length)
                ans[i] = nums[a++];
            else {
                a = 0;
                ans[i] = nums[a++];
            }
        }
        return ans;
    }
}
