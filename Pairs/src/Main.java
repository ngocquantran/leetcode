import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Set<Integer> set=new HashSet<>();
        for (Integer num:arr){
            set.add(num);
        }
        int sum=0;
        for (Integer num:arr){
            if (set.contains(num+k)){
                sum++;
            }
        }
        return sum;

    }
}
