import java.util.Arrays;
//  https://leetcode.com/problems/create-target-array-in-the-given-order/
//  https://leetcode.com/problems/create-target-array-in-the-given-order/solutions/3103984/beats-100-0ms-runtime-java-solution/
public class Question9 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] arr2 = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr, arr2)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            arr[i] = list.get(i);
        return arr;
    }
}
