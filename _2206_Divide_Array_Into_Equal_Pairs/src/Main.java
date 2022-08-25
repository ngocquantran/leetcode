import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={3,2,3,2,2,2};
        System.out.println(divideArray(nums));

    }
    public static boolean divideArray(int[] nums) {
        int[] arr=new int[501];
        for (int i=0;i< nums.length;i++){
            arr[nums[i]]++;
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i< arr.length;i++){
            if (arr[i]>0 && arr[i]%2==0){
               return false;
            }
        }
        return true;

    }
}