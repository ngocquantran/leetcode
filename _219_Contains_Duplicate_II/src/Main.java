import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        int[] nums={1,2,3,1};
//        int k=3;
//        System.out.println(containsNearbyDuplicate(nums,k));
        int[] arr={1,2,3,1,2,3,4,5,6};
        System.out.println(containsNearbyDuplicate(arr,2));
//        Map<Integer, Integer> myMap=new HashMap<>();
//        for (int i:arr){
//            if (myMap.containsKey(i)==false){
//                myMap.put(i,1);
//            }else {
//                int soLanXuatHien=myMap.get(i);
//                soLanXuatHien++;
//                myMap.put(i,soLanXuatHien);
//            }
//        }

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int i=0;i< nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
                if (i-map.get(nums[i])<=k){
                    return true;
                }
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
