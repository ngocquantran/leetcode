import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] deck={1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(deck));

    }
    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length<2 ) return false;
        Map<Integer,Integer> list=new HashMap<>();
        for(int i=0;i<deck.length;i++){
            if (!list.containsKey(deck[i])){
                list.put(deck[i],1);
            }else {
                list.put(deck[i], list.get(deck[i])+1);
            }
        }

        System.out.println(list);

        Map<Integer,Integer> divison=new HashMap<>();
        for(Integer i: list.values()){
            for(int k=2;k<=i;k++){
                if (i%k==0){
                    if (!divison.containsKey(k)) divison.put(k,1);
                    else divison.put(k, divison.get(k)+1);
                }
            }
        }
        System.out.println(divison);
        for (Integer i: divison.values()){
            if (i==list.size()) return true;
        }

        return false;

    }


}
