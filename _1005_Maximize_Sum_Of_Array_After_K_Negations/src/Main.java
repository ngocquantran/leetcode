import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4,-2,-3};
        int k = 4;
        System.out.println(largestSumAfterKNegations(nums,k));

    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int index=0;
        while (k>0){
            if (index< nums.length && nums[index]<0){
                nums[index]*=(-1);
                index++;
                k--;
                System.out.println(Arrays.toString(nums));
            }else if (index< nums.length && nums[index]==0){
                k=0;
                System.out.println(Arrays.toString(nums));
            }else {
                if (k%2==0){
                    k=0;
                    System.out.println(Arrays.toString(nums));
                }else {
                    int min=Integer.MAX_VALUE;
                    int minIndex=-1;
                    for (int i=0;i< nums.length;i++){
                        if (Math.abs(nums[i])<min){
                            min=Math.abs(nums[i]);
                            minIndex=i;
                        }
                    }
                    nums[minIndex]*=-1;
                    k=0;
                    System.out.println(Arrays.toString(nums));

                }
            }
        }
        int result=0;
        for (Integer n:nums){
            result+=n;
        }

        return result;


    }
}
