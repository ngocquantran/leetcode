public class Main {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] sArr=new int[27];
        int[] tArr=new int[27];
        for (int i=0;i<s.length();i++){
            sArr[s.charAt(i)-'a'+1]++;
            tArr[t.charAt(i)-'a'+1]++;
        }
        for (int i=0;i<sArr.length;i++){
            if (sArr[i]!=tArr[i]) return false;
        }
        return true;

    }
}
