import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1={4,7,9,7,6,7};
        int[] nums2={5,0,0,6,1,6,2,2,4};
        int[] result=intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));


    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] arr1=new int[1001];
        int[] arr2=new int[1001];
        for (int i=0;i<Math.max(nums1.length, nums2.length);i++){
            if (i< nums1.length) arr1[nums1[i]]++;
            if(i< nums2.length) arr2[nums2[i]]++;
        }
        List<Integer> list=new ArrayList<>();
        int count=0;
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]>0 && arr2[i]>0){
                for (int j=1;j<=Math.min(arr1[i], arr2[i]);j++){
                    list.add(i);
                    count++;
                }


            }
        }

        int[] result=new int[count];
        for (int i=0;i< list.size();i++){
            result[i]= list.get(i);
        }
        return result;

    }
}
