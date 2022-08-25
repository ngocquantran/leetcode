import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(hashFunction("000A"));

    }
//    public static List<Integer> authEvents(List<List<String>> events) {
//        // Write your code here
//
//
//    }
    public static long  hashFunction(String s){
        long n=s.length();
        long result=0;
        for (long i=0;i<n-1;i++){
            result+=((long)s.charAt(i))*Math.pow(131,n-i);
        }
        result+=(long)s.charAt(n-1) % (Math.pow(10,9)+7);
        return result;
    }
}
