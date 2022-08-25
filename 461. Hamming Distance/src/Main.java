

public class Main {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));

    }
    public static int hammingDistance(int x, int y) {
        String s1=Integer.toBinaryString(x);
        String s2=Integer.toBinaryString(y);
        int count=0;
        int index=0;
        while (index<s1.length() && index<s2.length()){
            System.out.println("index: "+index+" - s1[]: "+s1.charAt(s1.length()-1-index)+" - s2[]: "+s2.charAt(s2.length()-1-index));
            if (s1.charAt(s1.length()-1-index)!=s2.charAt(s2.length()-1-index)) count++;
            System.out.println(count);
            index++;
        }
        while (index<s1.length()){
            System.out.println("index: "+index+"s1[]: "+s1.charAt(s1.length()-1-index));
            if (s1.charAt(s1.length()-1-index)=='1') count++;
            index++;
        }
        while (index<s2.length()){
            System.out.println("index: "+index+"s2[]: "+s2.charAt(s2.length()-1-index));
            if (s2.charAt(s2.length()-1-index)=='1') count++;
            index++;
        }
        return count;

    }
}
