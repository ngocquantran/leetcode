import java.util.*;

public class Main {
    public static void main(String[] args) {
        String order = "cbafg";
        String s = "abcd";
        System.out.println(customSortString(order,s));


    }
    public static String customSortString(String order, String s) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> mapS=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (order.indexOf(s.charAt(i))>=0){
                map.put(s.charAt(i), order.indexOf(s.charAt(i)));
            }else map.put(s.charAt(i), 300);
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        System.out.println(mapS);



        StringBuilder sb=new StringBuilder();
        for (Map.Entry<Character,Integer> e:list){
            System.out.println(e.getKey() + " - " + e.getValue());
            int count=1;
            while (count<=mapS.get(e.getKey())){
                sb.append(e.getKey());
                count++;
            }
        }

        return sb.toString();



    }
}
