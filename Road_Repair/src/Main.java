import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {
        // Write your code here
        Collections.sort(crew_id, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Collections.sort(job_id, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        long sum=0;
        for (int i=0;i<crew_id.size();i++){
            sum+=Math.abs(job_id.get(i)-crew_id.get(i));
        }
        return sum;

    }
}
