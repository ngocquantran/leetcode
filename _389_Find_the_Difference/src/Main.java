public class Main {
    public static void main(String[] args) {
        char mi='s';
        int t=mi;
        System.out.println(t);
    }
    public char findTheDifference(String s, String t) {
        int tt=0;
        int ss=0;
        for (int i=0;i<s.length();i++){
            ss+=s.charAt(i);
        }
        for (int i=0;i<t.length();i++){
            tt+=t.charAt(i);
        }
        char result=(char)(tt-ss);
        return result;

    }
}
