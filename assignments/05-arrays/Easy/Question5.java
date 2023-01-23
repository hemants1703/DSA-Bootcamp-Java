import java.util.Arrays;
//  https://leetcode.com/problems/shuffle-the-array/
public class Question5 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
    public static int[] shuffle(int[] nums, int n) {
        if(nums.length == 1 || nums.length == 2)
            return nums;
        for(int i = 1; i < n; i += 2) {
            int temp = nums[n];
            for(int j = n; j > i; j--)
                nums[j] = nums[j - 1];
            nums[i] = temp;
            n++;
        }
        return nums;
    }
}
