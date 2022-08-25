import java.util.Arrays;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
       String  s = "is2 sentence4 This1 a3";
        String[] copy=s.split(" ");
        System.out.println(Arrays.toString(copy));
        System.out.println(sortSentence(s));
        System.out.println('1'-'0');

    }
    public static String sortSentence(String s) {

        String[] list= new String[10];
        String[] copy=s.split(" ");
        for (String str:copy){
            int index=str.charAt(str.length()-1)-'0';
            list[index]=str.substring(0,str.length()-1)+" ";
        }

        StringBuilder sb=new StringBuilder();
        for (String str:list){
            if (str!=null){
                sb.append(str);
            }
        }

        return sb.toString().trim();


    }
}
