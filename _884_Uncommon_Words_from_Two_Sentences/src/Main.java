import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "op vu kux dn jsenj hbdez hbdez nbenh z op dxmqd op";
        String s2 = "kux wnx wnx wbi jsenj nlgfn vu f vu fvxas dn op tb";

//        String a=" apple";
//        String b="apple";
//
//        System.out.println(s2.matches("^[\\s\\w]*\\b"+a.trim()+"\\b[\\s\\w]*$"));
//        System.out.println(s2.matches("^[\\s\\w]*\\b"+b.trim()+"\\b[\\s\\w]*$"));
//
//        String s3=s1.replaceFirst(a.trim(),"");
//        System.out.println(s3);
//        System.out.println(s1.replaceFirst(a.trim(),"").matches("^[\\s\\w]*\\b"+a.trim()+"\\b[\\s\\w]*$"));

        String[] result=uncommonFromSentences(s1,s2);
        System.out.println(Arrays.toString(result));

    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        String[] ar1=s1.split(" ");
        System.out.println(Arrays.toString(ar1));
        String[] ar2=s2.split(" ");
        System.out.println(Arrays.toString(ar2));

        List<String> list=new ArrayList<>();

        for ( String s:ar1){
            hm.put(s.trim(),hm.getOrDefault(s,0)+1);
        }
        for ( String s:ar2){
            hm.put(s.trim(),hm.getOrDefault(s,0)+1);
        }
        for (String s: hm.keySet()){
            if (hm.get(s)==1){
                list.add(s);
            }
        }

        return list.toArray(new String[0]);

    }
    public static String[] uncommonFromSentences2(String s1, String s2) {
        String[] ar1=s1.split(" ");
        System.out.println(Arrays.toString(ar1));
        String[] ar2=s2.split(" ");
        System.out.println(Arrays.toString(ar2));
        List<String> list=new ArrayList<>();
        for ( String s:ar1){
            if (!s2.matches("^[\\s\\w]*\\b"+s.trim()+"\\b[\\s\\w]*$")
                && !s1.replaceFirst("\\b"+s.trim()+"\\b","").matches("^[\\s\\w]*\\b"+s.trim()+"\\b[\\s\\w]*$")){
                list.add(s);
            }

        }
        for ( String s:ar2){
            if (!s1.matches("^[\\s\\w]*\\b"+s.trim()+"\\b[\\s\\w]*$")
                && !s2.replaceFirst("\\b"+s.trim()+"\\b","").matches("^[\\s\\w]*\\b"+s.trim()+"\\b[\\s\\w]*$")){
                list.add(s);
            }

        }
        return list.toArray(new String[0]);

    }
}
