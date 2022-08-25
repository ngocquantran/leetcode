import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word="a123bc34d8ef34";
        String[] toke=numDifferentIntegers3(word);
        for (String s:toke){
            System.out.println(s);
        }

//        String str="01";
//        str=str.replaceAll("^0+","");
//        System.out.println(str);



    }
    public static int numDifferentIntegers(String word) {
        word+='a';
        Set<String> st=new HashSet<>();
        String element="";

        for (int i=0;i<word.length();i++){
            if ((int)(word.charAt(i))<=57 && (int)(word.charAt(i))>=48){
                element+=word.charAt(i);
            }else {
                while (element.length()>1 &&element.charAt(0)=='0'){
                    element.substring(1);
                }
                if (element.length()>0){
                    st.add(element);
                }
                element="";
            }
        }

        return st.size();


    }
    public static int numDifferentIntegers2(String word) {
        Set<String> st=new HashSet<>();
        Scanner sc;
        sc=new Scanner(word);
        sc.useDelimiter("[^\\d]+");
        while (sc.hasNext()){
            String token=sc.next();
            token=token.replaceAll("^0+","");
            st.add(token);
        }
        return st.size();

    }

    public static String[] numDifferentIntegers3(String word) {
        String[] token;
        token=word.split("[^\\d]+");
        return  token;

    }
}
