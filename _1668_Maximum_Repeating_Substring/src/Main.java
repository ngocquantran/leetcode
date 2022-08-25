import java.nio.file.attribute.UserPrincipalNotFoundException;

public class Main {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence,word));

    }
    public static int maxRepeating(String sequence, String word) {
        int max=0;
        for (int i=0;i<sequence.length();i++){
            int start=i;
            int count=0;
            boolean isContinue=true;
            while (isContinue){
                if (sequence.substring(start).startsWith(word)){
                    count++;
                    start=start+word.length();
                }else {
                    isContinue=false;
                }
            }
            max=Math.max(max,count);

        }
        return max;

    }
}
