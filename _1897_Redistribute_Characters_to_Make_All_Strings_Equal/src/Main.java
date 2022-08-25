public class Main {
    public static void main(String[] args) {

    }
    public boolean makeEqual(String[] words) {
        if (words.length==1) return true;
        int sum=0;
        for (String w:words){
            sum+=w.length();
        }
        if (sum% words.length!=0) return false;
        int[] arr=new int[27];
        for (String w:words){
            for (int i=0;i<w.length();i++){
                arr[w.charAt(i)-'a'+1]++;
            }
        }
        for (int i=1;i<arr.length;i++){
            if (arr[i]>0 && arr[i]!=(sum/ words.length)) return false;
        }
        return true;
    }
}
