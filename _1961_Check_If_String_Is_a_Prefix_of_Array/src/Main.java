public class Main {
    public static void main(String[] args) {
        String s="aaa";
        String[] words = {"aa","aaa","fjaklfj"};
        System.out.println(isPrefixString(s,words));

    }
    public static boolean isPrefixString(String s, String[] words) {
        int start=0;

        for (int i=0;i< words.length;i++){
            String piece="";
            if (start+words[i].length()<s.length()){
                piece=s.substring(start,start+words[i].length());
            } else {
                piece=s.substring(start);
            }
                if (piece.equals(words[i])){
                    start=start+words[i].length();
                    if (start>=s.length()) return true;
                }else return false;
        }
        return false;


    }
}
