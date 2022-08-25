import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public int dominantIndex(int[] nums) {
        if (nums.length==1) return 0;
        int max=nums[0];
        int indexMax=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
                indexMax=i;
            }
        }
        for (int i=0;i< nums.length;i++){
            if (i!=indexMax && nums[i]*2>max){
                return -1;
            }
        }
        return indexMax;


    }
}
