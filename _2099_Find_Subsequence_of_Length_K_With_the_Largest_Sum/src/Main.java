import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,-2,3,4};

        int k =3;
        maxSubsequence(nums,k);

    }
    public static int[] maxSubsequence(int[] nums, int k) {
        if (k== nums.length) return nums;

        List<Integer> list=new ArrayList<>();
        for (int i=0;i<k;i++){
            list.add(nums[i]);
        }


        for (int i=k;i< nums.length;i++){
            System.out.println("i: "+i);
            System.out.println(Arrays.toString(list.toArray()));
            int minIndex=0;
            for (int j=1;j< list.size();j++){
                if (list.get(j)<list.get(minIndex)){
                    minIndex=j;
                }
            }
            System.out.println("minIndex= "+minIndex);
            System.out.println("nums[i]= "+nums[i]+" ---- list.get(minIndex)= "+list.get(minIndex));
            if (nums[i]>list.get(minIndex)){
                list.remove(minIndex);
                list.add(nums[i]);
            }
            System.out.println(Arrays.toString(list.toArray()));
            System.out.println();
        }
        int[] result=new int[k];
        for (int i=0;i<k;i++){
            result[i]=list.get(i);
        }
        return result;






//        int[] result=new int[k];
//        List<Integer> list=new ArrayList<>();
//        for (int i=0;i<k;i++){
//            int max=nums[0];
//            int indexMax=0;
//            for (int j=0;j< nums.length;j++){
//                if (nums[j]>max && !list.contains(j)){
//                    max=nums[j];
//                    indexMax=j;
//                }
//            }
//            list.add(indexMax);
//        }
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        for (int i=0;i< result.length;i++){
//            result[i]=nums[list.get(i)];
//        }
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(Arrays.toString(result));
//        return result;


    }
}
