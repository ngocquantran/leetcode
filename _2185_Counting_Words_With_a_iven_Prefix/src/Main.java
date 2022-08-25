public class Main {
    public static void main(String[] args) {

    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String w:words){
            if (w.startsWith(pref)){
                count++;
            }
        }
        return count;

    }
}
