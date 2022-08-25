import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"abca","aba","aaab"};
//        System.out.println(longestCommonPrefix(strs));
        String st1=String.join("",strs);
        System.out.println(st1);
        Set<Character> list=new HashSet<>();
        list.add('a');
        list.add('b');
        String st2=String.join("",list.toArray());
        System.out.println(st2);

    }

    public static String longestCommonPrefix(String[] strs) {

        HashSet<Character> list=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<strs[0].length();i++){
            list.add(strs[0].charAt(i));
            System.out.println("i: "+i);
            System.out.println("result trước khi chạy vòng lặp: "+sb.toString());
            for (int j=1;j< strs.length;j++){
                if (i>=strs[j].length() ){
                    return sb.toString();
                }
                System.out.println("j= "+j+" strs["+j+"].charAt("+i+")= "+strs[j].charAt(i));
                if (!list.contains(strs[j].charAt(i))){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
            list.removeAll(list);

            System.out.println("result sau khi chạy vòng lặp: "+sb.toString());
        }




        return "";


    }
}
