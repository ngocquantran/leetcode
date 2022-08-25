public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'0');
        System.out.println((int)'9');

    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[\\W\\_]*","");
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;

    }


}
