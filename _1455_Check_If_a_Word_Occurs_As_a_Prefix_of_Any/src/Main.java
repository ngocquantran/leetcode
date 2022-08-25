import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence,searchWord));

    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr=sentence.split(" ");
        for (int i=0;i< arr.length;i++){
            if (arr[i].trim().startsWith(searchWord)) return i;
        }
        return -1;

    }
}
