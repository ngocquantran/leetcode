import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums={23,297,427,949,945};
        System.out.println(canBeIncreasing2(nums));

    }

    public static boolean canBeIncreasing2(int[] nums) {
        if(nums.length==2) return true;
        int index1=-1, index2=-1;

        for (int i=0;i< nums.length-1;i++){
            if (nums[i]>=nums[i+1]){
                index1=i;
                index2=i+1;
                break;
            }
        }

        if (index1==-1) return true;
        int count1=0;
        int count2=0;
        for (int i=1;i< nums.length;i++){
            if (i==index1 && i< nums.length-1){
                i++;
                if (nums[i]>nums[i-2]) count1++;
            }else {
                if (nums[i]>nums[i-1]) count1++;
            }
        }
        System.out.println(count1);

        for (int i=1;i< nums.length;i++){
            if (i==index2 && i< nums.length-1){
                i++;
                if (nums[i]>nums[i-2]) count2++;
            }else {
                if (nums[i]>nums[i-1]) count2++;
            }
        }
        System.out.println(count2);

        return count1>= nums.length-2 || count2>= nums.length-2;

    }
    public static boolean canBeIncreasing(int[] nums) {

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int index1=-1;
        int index2=-1;

        for (int i=0;i< nums.length-1;i++){
            if (nums[i]>=nums[i+1]){
                index1=i;
                index2=i+1;
                break;
            }
        }
        System.out.println(index1);
        System.out.println(index2);
//        if (index1==-1) return true;
        for (int i=0;i< nums.length;i++){
            if (i!=index1) list1.add(nums[i]);
            if (i!=index2) list2.add(nums[i]);
        }
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));

        return checkStrictIncrease(list1) || checkStrictIncrease(list2);

    }

    public static boolean checkStrictIncrease(List<Integer> nums){
        if (nums.size()==1) return true;
        for (int i=1;i< nums.size();i++){
            if (nums.get(i)<nums.get(i-1)) return false;
        }
        return true;
    }
}
