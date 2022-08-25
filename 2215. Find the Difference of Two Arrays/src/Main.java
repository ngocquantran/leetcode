import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int[] arr1=new int[2001];
        int[] arr2=new int[2001];
        for (int i=0;i< nums1.length;i++){
            arr1[nums1[i]+1000]++;
        }
        for (int i=0;i< nums2.length;i++){
            arr2[nums2[i]+1000]++;
        }
        for (int i=0;i< arr1.length;i++){
            if (arr1[i]>0 && arr2[i]==0){
                list1.add(i-1000);
            }
        }

        for (int i=0;i< arr2.length;i++){
            if (arr2[i]>0 && arr1[i]==0){
                list2.add(i-1000);
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;


    }
}
