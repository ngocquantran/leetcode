import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        String str="loveleetcode";
//        System.out.println(first2(str));

        String str="leetcode";
        Map<Character, Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
//                int soLanXuatHien=map.get(str.charAt(i));
//                soLanXuatHien++;
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        for (int i=0;i<str.length();i++){
            if (map.get(str.charAt(i))==1){
                System.out.println(i);
                break;
            }
        }




    }
    public static int first(String s){
        int k=-1;
        for (int i=0;i<s.length();i++){
           if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
               k=i;
               break;
           }
        }
        return k;
    }

    public static int first2(String s){
        int i=0;
        boolean isContinue=true;
        while (isContinue){
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }else {
                i++;
            }
        }
        return -1;
    }

    public static int firstUnique(String s){
        char[] arr=s.toCharArray();
        int[] count=new int[123];

        for (int i=0;i< arr.length;i++){
            char c=arr[i];
            int index=(int)c;
            count[index]++;

        }
        for (int i=0;i< arr.length;i++){
            char c=arr[i];
            int index=(int)c;
            if (count[index]==1){
                return i;
            }
        }
        return -1;

    }
}
