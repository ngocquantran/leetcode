public class Main {
    public static void main(String[] args) {
        int[] nums={-1};
        maxSubArray(nums);

    }
    public static int maxSubArray(int[] nums) {
        int[] max=new int[nums.length];
        int maxSum=nums[0];
        max[0]=nums[0];
        for (int i=1;i< nums.length;i++){
            max[i]=Math.max(max[i],max[i]+max[i-1]);
            maxSum=Math.max(maxSum,max[i]);
        }
        return maxSum;

    }
}
