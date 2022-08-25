public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(2));

    }
    public static boolean isHappy(int n) {
        int result=n;
        while (result>=0){
            String s=String.valueOf(result);
            System.out.println(s);
            result=0;
            for (int i=0;i<s.length();i++){
                result+=Math.pow(s.charAt(i)-'0',2);
            }
            System.out.println(result);
            System.out.println();
            if (result==1) return true;
        }
        return false;

    }
}
