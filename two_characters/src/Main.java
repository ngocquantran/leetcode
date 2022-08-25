import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "cwomzxmuelmangtosqkgfdqvkzdnxerhravxndvomhbokqmvsfcaddgxgwtpgpqrmeoxvkkjunkbjeyteccpugbkvhljxsshpoymkryydtmfhaogepvbwmypeiqumcibjskmsrpllgbvc";
        System.out.println(alternate(s));


    }

    public static int alternate(String s) {
        // Write your code here
        System.out.println(s);

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (map.size() <= 1) return 0;
        List<Map.Entry<Character, Integer>> listMap = map.entrySet().stream().collect(Collectors.toList());
        Collections.sort(listMap, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println(listMap);
        int max=0;

        for (int i = 0; i < listMap.size(); i++) {
            for (int j = i + 1; j < listMap.size(); j++) {
//                if (Math.abs(listMap.get(j).getValue() - listMap.get(i).getValue()) > 1) {
//                    break;
//                } else {
                    StringBuilder sb = new StringBuilder();
                    char char1 = listMap.get(i).getKey();
                    char char2 = listMap.get(j).getKey();
                    for (int k = 0; k < s.length(); k++) {
                        char c = s.charAt(k);
                        if (sb.length() > 0 && c == sb.charAt(sb.length() - 1)) {
                            break;
                        } else if (c == char1 || c == char2) {
                            sb.append(c);
                        }
                    }
                    System.out.println("char1: " + char1 + "   -  char2: " + char2 + "   -   sb:" + sb);
                    if (sb.length() == listMap.get(i).getValue() + listMap.get(j).getValue()) {
                        max=Math.max(max,sb.length());
                    }
                //}
            }

        }
        return max;


    }
}
