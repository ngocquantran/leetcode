import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=simplifiedFractions(5);
        for (String s:list){
            System.out.print(s+"\t");
        }
    }
    public static List<String> simplifiedFractions(int n) {
        List<String> list=new ArrayList<>();
        if (n == 1) {
            return list;
        }else {
            int top=1;
            int bottom=2;
            while (top<n && bottom<=n){
                while (bottom<=n){
                    if (top==1){
                        list.add(top+"/"+bottom);
                    }else {
                        if (bottom%top!=0){
                            list.add(top+"/"+bottom);
                        }
                    }
                    bottom++;
                }
                top++;
                bottom=top+1;

            }
            return list;
        }


    }
}
