import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned={"a"};
        System.out.println(mostCommonWord(paragraph,banned));

    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        List<String> ban=new ArrayList<>();
        for (String b:banned){
            ban.add(b.trim().toLowerCase());
        }
        paragraph=paragraph.replaceAll("[!?',;.]"," ");
        String[] para=paragraph.split("[\\s]+");
        Map<String,Integer> map=new HashMap<>();
        for (int i=0;i<para.length;i++){
            if (!ban.contains(para[i].trim().toLowerCase())){
                map.put(para[i].trim().toLowerCase(), map.getOrDefault(para[i].trim().toLowerCase(),0)+1);
            }
        }
        System.out.println(map);
        String result=para[0].trim().toLowerCase();
        for (String s: map.keySet()){
            System.out.println(s);
            System.out.println(map.get(s));
            System.out.println(map.getOrDefault(result,0));
            System.out.println();
            if (map.get(s)> map.getOrDefault(result,0)){
                result=s;
            }
        }
        return result;

    }
}
