import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sentence));

    }
    public static String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>();
        for (String d:dictionary){
            set.add(d);
        }
        int startIndex=0;
        StringBuilder result=new StringBuilder();
        for (int i=1;i<sentence.length()-1;i++){
            result.append(sentence.charAt(i));
            if (sentence.charAt(i)==' '){
                startIndex=i+1;
            }else {
                if (set.contains(sentence.substring(startIndex,i+1))){
                    result.delete(startIndex,result.length());
                    result.append(sentence.substring())

                }
            }


        }
        return result.toString().trim();

    }
}
