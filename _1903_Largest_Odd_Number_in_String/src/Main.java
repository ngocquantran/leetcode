public class Main {
    public static void main(String[] args) {

    }
    public String largestOddNumber(String num) {
        while ( num.charAt(0)=='0'){
            num=num.substring(1);
        }
        int n=num.length();
        int count=0;
        for (int i=num.length()-1;i>=0;i--){
            if (Character.getNumericValue(num.charAt(i))%2!=0){
                num=num.substring(0,i+1);
                break;
            }else {
                count++;
            }
        }
        if (count==n){
            return "";
        }else return num;



    }

}
