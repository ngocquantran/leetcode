public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
//        System.out.println(26*26+25);
//        System.out.println((int)'A');
//        System.out.println((int)'Z');
//        System.out.println((int)'A'-'A'+1);
//        System.out.println((int)'Z'-'A'+1);

    }
    public static int titleToNumber(String columnTitle) {
        int result=0;
        int pow=0;
        for (int i=columnTitle.length()-1;i>=0;i--){
            result+=Math.pow(26,pow)*((int)columnTitle.charAt(i)-'A'+1);
            pow++;
        }
        return result;


    }
}
