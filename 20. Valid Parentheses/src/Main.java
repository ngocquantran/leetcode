import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s="[({(())}[()])]";

        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        boolean isContinue=true;
        while (isContinue){
            int a=s.length();
            s=s.replaceAll("\\{\\}","");
            s=s.replaceAll("\\[\\]","");
            s=s.replaceAll("\\(\\)","");
            s=s.replaceAll("[\\s]*","");
            if (s.length()==a) isContinue=false;

        }
        if (s.length()>0) return false;
        return true;

    }
}
