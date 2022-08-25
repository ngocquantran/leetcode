import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s).toString());

    }
    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        for (int i=0;i<s.length()-9;i++){
            String str="";
            if (i==s.length()-10){
                str=s.substring(i);
            }else {
                str=s.substring(i,i+10);
            }
            map.put(str, map.getOrDefault(str,0)+1);
        }
        List<String> result=new ArrayList<>();
        for (String st: map.keySet()){
            if (map.get(st)>=2){
                result.add(st);
            }
        }
        return result;
    }
}
