import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i].trim(), map.getOrDefault(arr1[i].trim(), 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i].trim(), map.getOrDefault(arr2[i].trim(), 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}
