import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public List<String> stringMatching(String[] words) {
        List<String> result=new ArrayList<>();
        for (int i=0;i< words.length;i++){
            for (int j=0;j< words.length;j++){
                if (i!=j && words[i].contains(words[j])){
                    if (!result.contains(words[j])){
                        result.add(words[j]);
                    }
                }
            }
        }
        return result;

    }
}
