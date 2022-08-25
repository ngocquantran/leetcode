import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int i=0;i< nums.length;i++){
            map.put(nums[i], i);
        }

    }
}
