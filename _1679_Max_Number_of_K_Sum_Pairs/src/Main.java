import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(0).size();j++){
                if(i==j){
                    sum1+=arr.get(i).get(j);
                }else if (i+j==arr.size()-1){
                    sum2+=arr.get(i).get(j);
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        return Math.abs(sum1-sum2);

    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println(map);
        int count = 0;
        for (Integer n : nums) {
            if (map.containsKey(k - n)) {

                map.put(n, map.get(n) - 1);
                map.put(k - n, map.get(k - n) - 1);
                if (map.get(n) > 0 && map.get(k - n) > 0) {
                    count++;
                }

            }
            System.out.println("n: " + n);
            System.out.println("count= " + count);
            System.out.println(map);
        }
        return count;

    }

}
