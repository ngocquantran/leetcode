public class Main {
    public static void main(String[] args) {

    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for (String w:words){
            for (int i=0;i<allowed.length();i++){
                w=w.replace(allowed.charAt(i),' ');
            }
            w=w.trim();
            if (w.length()==0) count++;
        }
        return count;

    }
}
