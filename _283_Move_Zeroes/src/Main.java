import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={0};
        moveZeroes(nums);

    }
    public static void moveZeroes(int[] nums) {
        int index=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for (int i=0;i< nums.length-index;i++){
            nums[nums.length-1-i]=0;
        }
        System.out.println(Arrays.toString(nums));

    }

}
