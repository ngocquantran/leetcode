public class Main {
    public static void main(String[] args) {

    }
    public static boolean repeatedSubstringPattern(String s) {
        for (int i=1;i<=s.length()/2;i++){
            if (s.length()%i==0){
                StringBuilder sb=new StringBuilder();
                boolean isContinue=true;
                while (isContinue){
                    sb.append(s.substring(0,i));
                    if (!s.startsWith(sb.toString()) || sb.length()==s.length()){
                        isContinue=false;
                    }
                }
                if (s.equals(sb.toString())) return true;
            }
        }
        return false;

    }
}
