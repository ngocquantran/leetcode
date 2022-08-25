import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        List<Integer> indices=new ArrayList<>();
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                indices.add(i);
            }
            if (indices.size()>2) return false;
        }
        if (indices.size()==0) return true;
        if (indices.size()==1) return false;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s1.length();i++){
            if (i== indices.get(0)){
                sb.append(s1.charAt(indices.get(1)));
            }else if(i==indices.get(1)){
                sb.append(s1.charAt(indices.get(0)));
            }else {
                sb.append(s1.charAt(i));
            }
        }
        if (sb.toString().equals(s2)) return true;
        return false;

    }
}
