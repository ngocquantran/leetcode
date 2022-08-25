import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] digits={
                9};

        System.out.println(Arrays.toString(plusOne(digits)));

    }
    public static int[] plusOne(int[] digits) {

        int plus=0;
        if (digits[digits.length-1]==9){
            plus=1;
            digits[digits.length-1]=0;

            for (int i= digits.length-2;i>=0;i--){
                if (digits[i]!=9){
                    digits[i]+=plus;
                    plus=0;
                    break;
                }else {
                    digits[i]=0;
                    plus=1;
                }

            }
        }else {
            digits[digits.length-1]++;
            return digits;

        }


        if (plus!=0){
            int[] result=new int[digits.length+1];
            result[0]=1;
            for (int i= 1;i< result.length;i++){
                result[i]= digits[i-1];
            }
            return result;
        }else {
            return digits;
        }


    }
}
