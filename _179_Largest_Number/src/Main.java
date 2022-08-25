import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={34323,3432};
//        System.out.println(largestNumber(nums));
        System.out.println(choosePosition("34323","3432"));




    }
    public static String largestNumber(int[] nums) {
        String result="";

        String[] str=new String[nums.length];
        for (int i=0;i< nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(str,(a,b)-> ((b+a).compareTo(a+b)));
        if (str[0].equals("0")){
            return "0";
        }


        StringBuilder sb=new StringBuilder();

        for (String s:str){
            sb.append(s);
        }
        return sb.toString();


    }

    public static String choosePosition(String a, String b){
        int m=0;
        int n=0;
        boolean isContinue=true;
        while (isContinue){
            System.out.println("m: "+m+" - a[m]: "+a.charAt(m));
            System.out.println("n: "+n+" - b[n]: "+b.charAt(n));
            if (Character.getNumericValue(a.charAt(m))>Character.getNumericValue(b.charAt(n))){
                System.out.println("lớn hơn");
                return a;
            }else if(Character.getNumericValue(a.charAt(m))<Character.getNumericValue(b.charAt(n))){
                System.out.println("nhỏ hơn");
                return b;
            }else {
                if (a.length()==b.length()){
                    if (m<a.length()-1){
                        m++;n++;
                    }
                }else {
                    while (a.length()>b.length()){
                        m--;
                    }
                }

            }
        }
        return "";
    }

}
