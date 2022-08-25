import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums={-4,-3,-2,-1,60};
        System.out.println(maximumProduct(nums));

    }
    public static int maximumProduct(int[] nums) {
        if (nums.length==3) return nums[0]*nums[1]*nums[2];
        Arrays.sort(nums);
        if (nums[0]>0 || nums[nums.length-1]<0) return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);

    }
}
