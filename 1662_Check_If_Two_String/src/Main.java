public class Main {
    public static void main(String[] args) {

    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1="";
        String r2="";
        for (String a:word1){
            r1+=a;
        }
        for (String a:word2){
            r2+=a;
        }
        return r1.equals(r2);

    }
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder r1=new StringBuilder();
        StringBuilder r2=new StringBuilder();
        for (String a:word1){
            r1.append(a);
        }
        for (String a:word2){
            r2.append(a);
        }
        return r1.toString().equals(r2.toString());
    }
}
