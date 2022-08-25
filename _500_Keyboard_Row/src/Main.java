import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"omk"};
        System.out.println(Arrays.toString(findWords(words)));


    }
    public static String[] findWords(String[] words) {
        String first="[qwertyuiop]";
        String second="[asdfghjkl]";
        String third="[zxcvbnm]";
        List<String> list=new ArrayList<>();
        for (int i=0;i< words.length;i++){
            int check=0;
            for(int j=1;j< words[i].length();j++){
                if (getValue(words[i].charAt(j),first,second,third)!=getValue(words[i].charAt(0),first,second,third)){
                    check++;
                    break;
                }
            }
            if (check<1){
                list.add(words[i]);
            }
        }

        return list.toArray(new String[list.size()]);


    }
    public static int getValue(char c,String first,String second,String third){
//        String check=String.valueOf(c).toLowerCase();

        if (String.valueOf(c).toLowerCase().matches(first)){
            return 1;
        }else if(String.valueOf(c).toLowerCase().matches(second)){
            return 2;
        }else {
            return 3;
        }
    }
}
