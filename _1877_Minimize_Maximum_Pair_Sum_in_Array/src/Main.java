import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for (int i=0;i< nums.length;i++){
            int sum=nums[i]+nums[nums.length-1-i];
            if (sum>max){
                max=sum;
            }
        }
        return max;

    }
}
