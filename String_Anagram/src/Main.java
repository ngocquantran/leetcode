import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println('a'-'a');
        System.out.println('z'-'a');

    }
    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<String> copyDic=new ArrayList<>();
        List<String> copyQue=new ArrayList<>();
        for (String dic:dictionary){
            int[] arr=new int[26];
            for (int i=0;i<dic.length();i++){
                arr[dic.charAt(i)-'a']++;
            }
            String str=Arrays.toString(arr);
            copyDic.add(str);
        }
        Map<String,Integer> map=new HashMap<>();
        for (String que:query){
            int[] arr=new int[26];
            for (int i=0;i<que.length();i++){
                arr[que.charAt(i)-'a']++;
            }
            String str=Arrays.toString(arr);
            copyQue.add(str);
            map.put(str,0);
        }
        for (String str:copyDic){
            if (map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
        }

        List<Integer> result=new ArrayList<>();
        for (String str: copyQue){
            result.add(map.get(str));
        }
        return result;

    }
}
