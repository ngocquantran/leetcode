import javax.sound.midi.MidiFileFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<String> list=weightedUniformStrings("abccddde", Arrays.asList(1,3,12,5,9,10));
//        System.out.println(list.toString());

        int[] arr={14,19,25,32,41,45,6,25,35,46,54,55,6,13,16,27,47,54,1,8,10,23,29,39,2,12,19,33,43,49,2,4,12,35,40,46,12,15,26,35,36,37,20,25,30,35,42,47,3,11,22,32,37,39,7,14,17,22,39,50,11,36,37,39,47,55,10,29,36,40,52,54,12,26,31,34,36,38,4,5,21,27,45,51,1,12,13,23,36,39,12,22,27,32,37,38,5,18,20,37,40,41,27,34,39,42,47,55,2,19,23,30,34,38,11,15,18,35,38,40,10,12,46,51,52,53,9,16,43,49,54,55,9,12,15,16,21,38,5,8,16,19,23,28,2,4,23,34,37,46,6,18,20,39,42,45,9,13,22,30,36,43,10,11,21,22,31,43,22,26,34,37,50,54,12,20,23,26,29,43,4,12,14,26,31,35,6,7,12,18,32,41,9,10,12,15,33,41,11,12,14,23,46,48,4,14,23,25,43,53,3,26,27,37,48,51,1,2,10,21,35,43,7,8,16,26,33,42,11,31,44,46,52,54,12,16,19,35,37,45};
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        }).collect(Collectors.toList()).forEach(integerIntegerEntry -> System.out.println(integerIntegerEntry));
//        map.entrySet().stream().forEach(System.out::println);


    }
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        Set<Integer> set=new HashSet<>();
        int sum=s.charAt(0)-'a'+1;
        set.add(sum);

        for (int i=1;i<s.length();i++){
           if(s.charAt(i)!=s.charAt(i-1)){

               sum=s.charAt(i)-'a'+1;
           }else {
               sum=sum+s.charAt(i)-'a'+1;

           }
            set.add(sum);
        }
        System.out.println(set.toString());
        List<String> result=new ArrayList<>();
        for (Integer num:queries){
            if (set.contains(num)){
                result.add("YES");
            }else {
                result.add("NO");
            }
        }
        return result;
    }
}
