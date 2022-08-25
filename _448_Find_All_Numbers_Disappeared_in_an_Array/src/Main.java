import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
//        List<Integer> list=new ArrayList<>();
//        for (int i=0;i<nums.length;i++){
//            list.add(nums[i]);
//        }
//        System.out.println(list.toString());
//        list.removeAll(list);
//        System.out.println(list.toString());
        System.out.println(findDisappearedNumbers5(nums).toString());



    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i=1;i<=nums.length;i++){
            int found=0;
            for (int j=0;j< nums.length;j++){
                if (i==nums[j]){
                    found++;
                }
            }
            if (found<1){
                list.add(i);
            }
        }

        return list;
    }


    public static List<Integer> findDisappearedNumbers3(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            list1.add(nums[i]);
            }
        for (int i=1;i<= nums.length;i++){
            if (!list1.contains(i)){
                list.add(i);
            }
        }

        return list;
    }

    public static List<Integer> findDisappearedNumbers4(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            nums[Math.abs(nums[i])-1]=Math.abs(nums[Math.abs(nums[i])-1])*-1;
        }
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static List<Integer> findDisappearedNumbers5(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< nums.length;i++) {
            nums[nums[i]-1]=Math.abs(nums[nums[i]])*-1;
            System.out.println(Arrays.toString(nums));
        }
        return list;
    }
}

