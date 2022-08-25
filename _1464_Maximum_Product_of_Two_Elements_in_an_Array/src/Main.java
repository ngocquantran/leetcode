import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

    }

    public int maxProduct2(int[] nums) {
        int max1=0;
        int max2=0;
        for (Integer num:nums){
            if (num>=max1){
                max2=max1;
                max1=num;
            }else if(num>=max2){
                max2=num;
            }
        }


        return (max1-1)*(max2-1);

    }

}
