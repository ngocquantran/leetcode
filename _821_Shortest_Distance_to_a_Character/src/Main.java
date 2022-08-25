import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar2("aaba",'b')));


    }
    public static int[] shortestToChar(String s, char c) {
        List<Integer> appearIndex=new ArrayList<>();
        int[] result=new int[s.length()];
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c) appearIndex.add(i);
        }
        System.out.println(Arrays.toString(appearIndex.toArray()));
        for (int i=0;i<s.length();i++){
            int min=s.length();
            for (int j=0;j<appearIndex.size();j++){
                min=Math.min(min,Math.abs(appearIndex.get(j)-i));
            }
            result[i]=min;
        }

        return result;

    }
    public static int[] shortestToChar2(String s, char c) {

        int[] result=new int[s.length()];

        for (int i=0;i<s.length();i++){
            int min=s.length();
            int j=0;
            while (j<s.length()){
                min=Math.min(min,Math.abs(i-s.indexOf(c,j)));
                j=s.indexOf(c,j)+1;
            }

            result[i]=min;
        }

        return result;

    }
}
