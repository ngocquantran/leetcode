public class Main {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }
    public static int getLucky(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            str+=getNumber(s.charAt(i));
        }
        int result=0;
        for(int i=1;i<=k;i++){
            result=0;
            for (int j=0;j<str.length();j++){
                result+=Character.getNumericValue(str.charAt(j));

            }

            str=String.valueOf(result);


        }
        return result;

    }

    public static String getNumber(char c){
        int result =(int)c;
        String str=String.valueOf(result-96);
        return str;
    }
}
