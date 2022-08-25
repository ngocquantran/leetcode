import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={7,7,7,7,7,7};
        System.out.println(minSetSize(arr));

    }
    public static int minSetSize(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        System.out.println(list.toString());
        int result=0;
        int sum=0;
        for (int i=0;i< list.size();i++){
            sum+=list.get(i).getValue();
            result++;
            if (sum>= arr.length/2) break;
        }
        return result;

    }

    public static int minSetSize2(int[] arr) {
        int[] freq=new int[100001];
        for (int i=0;i< arr.length;i++){
            freq[arr[i]]++;
        }
        Arrays.sort(freq);
        int sum=0;
        int count=0;
        for (int i= freq.length-1;i>=0;i--){
            sum+=freq[i];
            count++;
            if (sum>= arr.length) break;
        }
        return count;
    }
}
