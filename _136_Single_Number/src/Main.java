import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={3,-1,2,5,-1,2,3};
//        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));

    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int mirrorSum=0;
        for (int i=0;i< nums.length;i+=2){
            mirrorSum+=nums[i];
        }
        int numsSum=0;
        for (int i=0;i<nums.length;i++){
            numsSum+=nums[i];
        }
        return (mirrorSum*2-numsSum);

    }

    public static int singleNumber2(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length;i++) {
            System.out.println("lần "+(i+1)+": i= "+i);
            System.out.println("result = "+result+" ; nums[i]= "+nums[i]);
            result=result^nums[i];
            System.out.println("result = "+result);
        }
        return result;
    }
}
