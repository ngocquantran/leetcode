import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] result=new int[3];
        int count=0;
        for (int i=0;i< nums.length-1;){
            if (nums[i]==nums[i+1]){
                i+=2;
            }else {
                result[count]=nums[i];
                result[count+1]=nums[i];
                count++;i++;
            }
            if (count>1){
                break;
            }
        }
        if (result[0]==result[1]){
            result[1]=nums[nums.length-1];
        }

        int[] result2={result[0],result[1]};
        return result2;

    }
}
