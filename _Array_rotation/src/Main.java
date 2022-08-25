import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(1);a.add(2);a.add(3);
        List<Integer> queries=new ArrayList<>();
        queries.add(0);queries.add(1);queries.add(2);
        circularArrayRotation(a,2,queries);

    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        int rotation = k % a.size();
        System.out.println("số vòng: "+rotation);
        int[] arr=new int[a.size()];
        for (int i=0;i< arr.length;i++){
            arr[i]=i+rotation;
            if (arr[i]> arr.length-1){
                arr[i]-=arr.length;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i=0;i< queries.size();i++){
            int index= queries.get(i);
            for (int j=0;j< arr.length;j++){
                if (index==arr[j]){
                    result.add(a.get(j));
                }
            }


        }
        System.out.println(result.toString());
        return result;

    }
}
