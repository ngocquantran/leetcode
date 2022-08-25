import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(0%3);
        System.out.println(1%3);
        System.out.println(2%3);
        System.out.println(3%3);
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int totalSum=0;
        int distinctiveSum=0;
        for (int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            if (i%3==0){
                distinctiveSum+=nums[i];
            }
        }
        return distinctiveSum-(totalSum-distinctiveSum)/2;

    }
}
