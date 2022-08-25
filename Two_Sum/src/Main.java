import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] nums={1,4,7,9};
//        int target=8;
//        int[] output= twoSum(nums,target);
//        System.out.println(Arrays.toString(output));

//        String s1="One";
//        String s2="Two";
//        String s3="Three";
//
//        String s4=s1.concat(s2);
//        System.out.println(s4);
//        System.out.println(s4.charAt(3));
//
//        String s5=s1+s2;
//        System.out.println(s5);
//        System.out.println(s5.charAt(3));

//        StringBuilder sb=new StringBuilder(10);
//        sb.append("Hello...");
//        System.out.println(sb.toString());
//        sb.append('!');
//        System.out.println(sb.toString());
//        sb.insert(8," Java");
//        System.out.println(sb.toString());
//        sb.delete(5,8);
//        System.out.println(sb.toString());

//        System.out.printf("Interger: %d\n",15);
//        System.out.printf("Floating point number with 3 decimal digits: %.3f\n",3.145685246);
//        System.out.printf("Floating point number with 8 decimal digits: %.8f\n",3.124589652479895);
//        System.out.printf("String: %s, interger: %d, float: %.3f\n","Hello",5,3.12456);
//        System.out.printf("Re-order output %4$2s %1$2s %3$2s %2$2s \n","a","b","c","d");
//
//        System.out.printf("%-9s%-9s%s\n","Column 1","Column 2","Column 3");
//        System.out.printf("%-9d%-9d%08d\n",15,12,5);

        Account account1=new Account("123456","Sữa ông thọ","Vinamilk",6,1000,50,"Trung Quốc",25000);
        System.out.println(account1);
        Account account2=new Account("123434","Sữa TH true milk","TH True Milk",12,500,10,"Việt Nam",25000);
        System.out.println(account2);












    }

    public static int[] twoSum(int[] nums, int target){
        int a=0,b=0;

        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]+nums[j]==target){
                    a=i;
                    b=j;

                    break;
                }
            }
        }
        int[] output={a,b};

        return output;
    }
}
